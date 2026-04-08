# Social Spark App

## Purpose
This app was created to help my friend Cora, but additionally it will also help other users maintain social connections by suggesting small actions ("social sparks") based on the time of day.

## Features
- The user will input the time of day, e.g. Morning, Afternoon, or Evening
- The app will display a relevant social suggestion based on the time of day the user has input
- Handles invalid input by suggesting a more cheerful message to be sent

## How It Works
The app uses Kotlin `when` statements to determine which suggestion to display based on user input.

## Design
- Simple and user-friendly interface with a small picture that is written "Social Sparks"
- Input field where the user can input the time of day, reset button, suggestion button and a button written "spark away" when they want to send the message, and output display
- Clean layout with proper spacing

## Testing
Manual testing was conducted using an Android Studio emulator:
- Verified correct suggestions for all valid inputs, e.g. Opps!, Try something like "Good Morning Sunshine", you can do it.
- Tested invalid inputs handling

## Version Control
GitHub was used to manage the project:
- Repository created
- Regular commits and pushes were made

## GitHub Actions
GitHub Actions was implemented to automate the build process:
- Automatically builds the project on every push
- Ensures code runs correctly outside local environment
