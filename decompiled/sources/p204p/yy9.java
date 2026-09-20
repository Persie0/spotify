package p204p;

import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class yy9 implements Predicate {

    /* JADX INFO: renamed from: a */
    public static final yy9 f277442a = new yy9();

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
        if ((accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected) || (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Disconnected)) {
            return true;
        }
        return ((accessoryStateManager$Event instanceof AccessoryStateManager$Event.Updated) && wj50.m88271j(((C1742ci) ((AccessoryStateManager$Event.Updated) accessoryStateManager$Event).getAccessory()).f38164g, Boolean.TRUE)) || (accessoryStateManager$Event instanceof AccessoryStateManager$Event.NoAccessoryConnected);
    }
}
