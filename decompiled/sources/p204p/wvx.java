package p204p;

import android.media.MediaRoute2Info;
import android.media.SuggestedDeviceInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wvx {
    /* JADX INFO: renamed from: a */
    public static final SuggestedDeviceInfo m89162a(v6r v6rVar) {
        return new SuggestedDeviceInfo.Builder(v6rVar.m84814a(), v6rVar.m84815b(), v6rVar.m84816c()).setExtras(Bundle.EMPTY).build();
    }

    /* JADX INFO: renamed from: b */
    public static final ild0 m89163b(MediaRoute2Info mediaRoute2Info) {
        String id = mediaRoute2Info.getId();
        String string = mediaRoute2Info.getName().toString();
        List<String> features = mediaRoute2Info.getFeatures();
        int type = mediaRoute2Info.getType();
        boolean zIsSystemRoute = mediaRoute2Info.isSystemRoute();
        Uri iconUri = mediaRoute2Info.getIconUri();
        CharSequence description = mediaRoute2Info.getDescription();
        return new ild0(id, string, features, type, zIsSystemRoute, iconUri, description != null ? description.toString() : null, mediaRoute2Info.getConnectionState(), mediaRoute2Info.getClientPackageName(), mediaRoute2Info.getVolumeHandling(), mediaRoute2Info.getVolumeMax(), mediaRoute2Info.getVolume(), mediaRoute2Info.getDeduplicationIds(), mediaRoute2Info.getExtras());
    }
}
