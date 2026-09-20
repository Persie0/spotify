package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vqb implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f243908a;

    /* JADX INFO: renamed from: b */
    public final String f243909b;

    /* JADX INFO: renamed from: c */
    public final String f243910c;

    /* JADX INFO: renamed from: d */
    public final int f243911d;

    /* JADX INFO: renamed from: e */
    public final String f243912e;

    /* JADX INFO: renamed from: f */
    public final tqb f243913f;

    /* JADX INFO: renamed from: g */
    public final boolean f243914g;

    /* JADX INFO: renamed from: h */
    public final String f243915h;

    /* JADX INFO: renamed from: i */
    public final String f243916i;

    /* JADX INFO: renamed from: j */
    public final String f243917j;

    /* JADX INFO: renamed from: k */
    public final String f243918k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f243919l;

    public vqb(String str, String str2, String str3, int i, String str4, tqb tqbVar, boolean z, String str5, String str6, String str7, String str8, ArrayList arrayList) {
        this.f243908a = str;
        this.f243909b = str2;
        this.f243910c = str3;
        this.f243911d = i;
        this.f243912e = str4;
        this.f243913f = tqbVar;
        this.f243914g = z;
        this.f243915h = str5;
        this.f243916i = str6;
        this.f243917j = str7;
        this.f243918k = str8;
        this.f243919l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqb)) {
            return false;
        }
        vqb vqbVar = (vqb) obj;
        return wj50.m88271j(this.f243908a, vqbVar.f243908a) && wj50.m88271j(this.f243909b, vqbVar.f243909b) && wj50.m88271j(this.f243910c, vqbVar.f243910c) && this.f243911d == vqbVar.f243911d && wj50.m88271j(this.f243912e, vqbVar.f243912e) && this.f243913f.equals(vqbVar.f243913f) && this.f243914g == vqbVar.f243914g && wj50.m88271j(this.f243915h, vqbVar.f243915h) && wj50.m88271j(this.f243916i, vqbVar.f243916i) && wj50.m88271j(this.f243917j, vqbVar.f243917j) && wj50.m88271j(this.f243918k, vqbVar.f243918k) && this.f243919l.equals(vqbVar.f243919l);
    }

    public final int hashCode() {
        return this.f243919l.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((this.f243913f.hashCode() + s571.m77243b(f710.m40938f(this.f243911d, s571.m77243b(s571.m77243b(this.f243908a.hashCode() * 31, 31, this.f243909b), 31, this.f243910c), 31), 31, this.f243912e)) * 31, 31, this.f243914g), 31, this.f243915h), 31, this.f243916i), 31, this.f243917j), 31, this.f243918k);
    }
}
