package p204p;

import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class rek {

    /* JADX INFO: renamed from: a */
    public final ArrayList f198376a;

    /* JADX INFO: renamed from: b */
    public final pla1 f198377b;

    /* JADX INFO: renamed from: c */
    public final String f198378c;

    /* JADX INFO: renamed from: d */
    public final String f198379d;

    /* JADX INFO: renamed from: e */
    public final boolean f198380e;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public rek(String str, String str2, ArrayList arrayList, pla1 pla1Var, boolean z) {
        this.f198376a = arrayList;
        this.f198377b = pla1Var;
        this.f198378c = str;
        this.f198379d = str2;
        this.f198380e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rek)) {
            return false;
        }
        rek rekVar = (rek) obj;
        return this.f198376a.equals(rekVar.f198376a) && wj50.m88271j(this.f198377b, rekVar.f198377b) && wj50.m88271j(this.f198378c, rekVar.f198378c) && wj50.m88271j(this.f198379d, rekVar.f198379d) && this.f198380e == rekVar.f198380e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(ydj.m93448g(this.f198377b, this.f198376a.hashCode() * 31, 31), 31, this.f198378c);
        String str = this.f198379d;
        return Boolean.hashCode(this.f198380e) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
