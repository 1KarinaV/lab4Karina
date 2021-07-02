package Interfaces;

import Creatures.Place;
import Enum.*;

public interface WalkAble {
    void go(Adverbs how);
    void go(Place where, Adverbs how);
}
