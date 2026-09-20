package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class avd {

    /* JADX INFO: renamed from: a */
    public final List f20160a;

    /* JADX INFO: renamed from: b */
    public final String f20161b;

    public avd(List list, String str) {
        this.f20160a = list;
        this.f20161b = str;
    }

    /* JADX INFO: renamed from: a */
    public static avd m27234a(avd avdVar, List list) {
        String str = avdVar.f20161b;
        avdVar.getClass();
        return new avd(list, str);
    }

    /* JADX INFO: renamed from: b */
    public final List m27235b() {
        return this.f20160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avd)) {
            return false;
        }
        avd avdVar = (avd) obj;
        return wj50.m88271j(this.f20160a, avdVar.f20160a) && wj50.m88271j(this.f20161b, avdVar.f20161b);
    }

    public final int hashCode() {
        int iHashCode = this.f20160a.hashCode() * 31;
        String str = this.f20161b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
