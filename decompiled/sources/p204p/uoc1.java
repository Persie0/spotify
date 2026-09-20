package p204p;

import android.os.Parcelable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class uoc1 {

    /* JADX INFO: renamed from: a */
    public final String f232398a;

    /* JADX INFO: renamed from: b */
    public final wg61 f232399b = new wg61(new ixb1(this, 8));

    public uoc1(String str) {
        this.f232398a = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83613a(String str) {
        return ((Pattern) this.f232399b.getValue()).matcher(str).matches();
    }

    /* JADX INFO: renamed from: b */
    public final voc1 m83614b(String str) {
        if (!m83613a(str)) {
            na6.m63965m("View URI " + str + " did not match pattern " + this.f232398a);
        }
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        return mug1.m62869n(str);
    }

    public final String toString() {
        return this.f232398a;
    }
}
