package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class tld0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f221451a;

    public tld0(Bundle bundle) {
        this.f221451a = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final HashSet m81044a() {
        Bundle bundle = this.f221451a;
        return !bundle.containsKey("allowedPackages") ? new HashSet() : new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m81045b() {
        Bundle bundle = this.f221451a;
        return !bundle.containsKey("controlFilters") ? new ArrayList() : new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    /* JADX INFO: renamed from: c */
    public final int m81046c() {
        return this.f221451a.getInt("deviceType");
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m81047d() {
        return this.f221451a.getBundle("extras");
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m81048e() {
        Bundle bundle = this.f221451a;
        return !bundle.containsKey("groupMemberIds") ? new ArrayList() : new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    /* JADX INFO: renamed from: f */
    public final Uri m81049f() {
        String string = this.f221451a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX INFO: renamed from: g */
    public final String m81050g() {
        return this.f221451a.getString("id");
    }

    /* JADX INFO: renamed from: h */
    public final String m81051h() {
        return this.f221451a.getString("name");
    }

    /* JADX INFO: renamed from: i */
    public final int m81052i() {
        return this.f221451a.getInt("volume");
    }

    /* JADX INFO: renamed from: j */
    public final int m81053j() {
        return this.f221451a.getInt("volumeHandling", 0);
    }

    /* JADX INFO: renamed from: k */
    public final int m81054k() {
        return this.f221451a.getInt("volumeMax");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m81055l() {
        return (TextUtils.isEmpty(m81050g()) || TextUtils.isEmpty(m81051h()) || m81045b().contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(m81050g());
        sb.append(", groupMemberIds=");
        sb.append(m81048e());
        sb.append(", name=");
        sb.append(m81051h());
        sb.append(", description=");
        Bundle bundle = this.f221451a;
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        sb.append(m81049f());
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean(x09.f256832d, true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(m81045b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(m81046c());
        sb.append(", volume=");
        sb.append(m81052i());
        sb.append(", volumeMax=");
        sb.append(m81054k());
        sb.append(", volumeHandling=");
        sb.append(m81053j());
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(m81047d());
        sb.append(", isValid=");
        sb.append(m81055l());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Alert.DURATION_SHOW_INDEFINITELY));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(m81044a().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
