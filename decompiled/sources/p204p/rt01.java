package p204p;

import android.net.Uri;
import com.spotify.music.R;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class rt01 {
    /* JADX INFO: renamed from: a */
    public static vbl0 m76358a(dd41 dd41Var) {
        Set set = mjd.f144234a;
        return new vbl0(R.drawable.encore_icon_bluetooth_24, R.string.on_platform_destination_people_nearby, 3, edb.m38564m("spotify:internal:users-nearby?entityUri=", Uri.encode(dd41Var.m35694A())), true);
    }
}
