
public interface AudioInterface {
    //cars can have audio or not have audio so it is an interface as a sort of plugin type thing
    // wouldnt be a caraccessory interface as you wouldnt make sense to group them
    // look for common behv -group, change behv- abstract. code for changes for the same reasons should be together.
    public void increaseVolume();

}

//
//advbigherosix extends bh6
//
//pv armour();
//
//vs
//
//advbh6 extends bh6 implements armourInterface

//former unless there is reason to reuse armour else where
// don't anticipate events;