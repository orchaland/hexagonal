package source

title "getting started"

receive event from input1
compute gettingStartedService with event.value
when "gettingStartedService terminates"
send gettingStartedService.result to output1
