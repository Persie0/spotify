package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class afk implements cfk {

    /* JADX INFO: renamed from: a */
    public final pla1 f15165a;

    /* JADX INFO: renamed from: b */
    public final String f15166b;

    /* JADX INFO: renamed from: c */
    public final String f15167c;

    /* JADX INFO: renamed from: d */
    public final boolean f15168d;

    /* JADX INFO: renamed from: e */
    public final List f15169e;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public afk(String str, String str2, List list, pla1 pla1Var, boolean z) {
        this.f15165a = pla1Var;
        this.f15166b = str;
        this.f15167c = str2;
        this.f15168d = z;
        this.f15169e = list;
    }

    @Override // p204p.cfk
    /* JADX INFO: renamed from: B */
    public final String mo25815B() {
        return this.f15167c;
    }

    @Override // p204p.cfk
    /* JADX INFO: renamed from: C */
    public final boolean mo25816C() {
        return this.f15168d;
    }

    @Override // p204p.cfk
    /* JADX INFO: renamed from: a */
    public final String mo25817a() {
        return this.f15166b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afk)) {
            return false;
        }
        afk afkVar = (afk) obj;
        return wj50.m88271j(this.f15165a, afkVar.f15165a) && wj50.m88271j(this.f15166b, afkVar.f15166b) && wj50.m88271j(this.f15167c, afkVar.f15167c) && this.f15168d == afkVar.f15168d && wj50.m88271j(this.f15169e, afkVar.f15169e);
    }

    @Override // p204p.cfk
    public final pla1 getSender() {
        return this.f15165a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f15165a.hashCode() * 31, 31, this.f15166b);
        String str = this.f15167c;
        return this.f15169e.hashCode() + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15168d);
    }
}
