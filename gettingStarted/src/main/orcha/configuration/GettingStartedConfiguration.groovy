package configuration

import orcha.lang.configuration.Application
import orcha.lang.configuration.EventHandler
import orcha.lang.configuration.Input
import orcha.lang.configuration.InputFileAdapter
import orcha.lang.configuration.JavaServiceAdapter
import orcha.lang.configuration.Output
import orcha.lang.configuration.OutputFileAdapter
import orcha.lang.configuration.OutputFileAdapter.WritingMode

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration
import service.GettingStartedApp;

@Configuration
class GettingStartedConfiguration {
		
	@Bean
	GettingStartedApp gettingStartedApp(){
		return new GettingStartedApp()
	}
	
	@Bean
	Application gettingStartedService(){
		def program = new Application(name: "gettingStartedService", language: "Java")
		def javaAdapter = new JavaServiceAdapter(javaClass: 'service.GettingStartedApp', method:'myMethod')
		program.input = new Input(type: "java.lang.Integer", adapter: javaAdapter)
		program.output = new Output(type: "java.lang.Integer", adapter: javaAdapter)
		return program
	}

	@Bean
	EventHandler input1(){
		def eventHandler = new EventHandler(name: "input1")
		def fileAdapter = new InputFileAdapter(directory: 'data/input', filenamePattern: "*.txt")
		eventHandler.input = new Input(mimeType: "application/json", type: "java.lang.Integer", adapter: fileAdapter)
		return eventHandler
	}
	
	@Bean
	EventHandler output1(){
		def eventHandler = new EventHandler(name: "output1")
		def fileAdapter = new OutputFileAdapter(directory: 'data/output', createDirectory: true, filename:'output.txt', appendNewLine: true, writingMode: WritingMode.REPLACE)
		eventHandler.output = new Output(mimeType: "text/plain", type: "java.lang.String", adapter: fileAdapter)
		return eventHandler
	}
}
