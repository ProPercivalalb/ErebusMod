package erebus.client.sound;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EntityBlackWidowNoises
{
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try 
        {
        //you will need to add a line like this for every single sound you add. 
        //the "yourmod:yoursound.ogg"  adds the sound to the sound library.
            event.manager.soundPoolSounds.addSound("erebus:blackwidowsound.ogg");      
            event.manager.soundPoolSounds.addSound("erebus:blackwidowhurt.ogg");
            event.manager.soundPoolSounds.addSound("erebus:webslingthrow.ogg");
            event.manager.soundPoolSounds.addSound("erebus:webslingsplat.ogg");
            event.manager.soundPoolSounds.addSound("erebus:squish.ogg"); 
        } 
        catch (Exception e)
        {
        //this is just an error message you can add. 
            System.err.println("There was a problem loading sounds. please report to the author");
        }
    }
}
