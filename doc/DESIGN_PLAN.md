# Simulation Design Plan
### Team Number 05
### Names 
Michael Williams mw376

Brian Li: bl195

Connor Penny: cgp19


## Design Overview
Model: Simulate Class- In charge of controlling the simulation/grid elements, modifies grid state, knows the rules of the simulation

        Grid - Class: Holds grid of cell objects. Knows rules for neighborhoods and can discern valid neighbors
        for a given cell. Has functionality to loop through cells in grid and apply rules to each cell
        
        Cell - Class: Holds the state of the cell and knows it's neighbhors, also holds the state of its next
        generation, and has functionality to change modify its state and its next generation state
        
        Rule - Interface: will be implemented for each game with logic specific to that game's rules and can
        modify a cell's next generation state given information about the cell's state and its neighbors
        
        File reader- Gets the game, the grid dimensions, & starting configuration of grid from a CSV
        

View: View Class- Has Start, Step, End

Start- USer loads a config,

End- End button for ending simulation

Step- Animating the model

Controller-

Controller Class- Pass file to the Model

Passes the grid to the view

## Design Details

In the View, the Start method passes the selected file into the Controller, 
where The file is then passed to the Model's File Reader, which passes the config to simulate



## Design Considerations

We do not know a class hierarchy for the model at this time, but we will work something out.



## User Interfac

First Screen- Select Simulation

SEcond Screen- Select Simulation File

Third Screen- See Simulation- see end button

4th Screen- Final view of the simulation, take back to start menu




## Team Responsibilities

 * Team Member #1 Brian - GUI/View and testing

 * Team Member #2 Michael Model and Testing

 * Team Member #3 Conner- Controller and Testing and part of the model

