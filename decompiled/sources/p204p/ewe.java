package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ewe extends fwe {

    /* JADX INFO: renamed from: a */
    public final String f63522a;

    /* JADX INFO: renamed from: b */
    public final String f63523b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f63524c;

    public ewe(String str, String str2, ArrayList arrayList) {
        this.f63522a = str;
        this.f63523b = str2;
        this.f63524c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewe)) {
            return false;
        }
        ewe eweVar = (ewe) obj;
        return this.f63522a.equals(eweVar.f63522a) && this.f63523b.equals(eweVar.f63523b) && this.f63524c.equals(eweVar.f63524c);
    }

    public final int hashCode() {
        return this.f63524c.hashCode() + s571.m77243b(this.f63522a.hashCode() * 31, 31, this.f63523b);
    }
}
