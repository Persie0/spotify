package p204p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel$Format;
import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel$Product;

/* JADX INFO: loaded from: classes9.dex */
public final class v150 {

    /* JADX INFO: renamed from: a */
    public final AdsModeModel$Format f236256a;

    /* JADX INFO: renamed from: b */
    public final AdsModeModel$Product f236257b;

    /* JADX INFO: renamed from: c */
    public final String f236258c;

    /* JADX INFO: renamed from: d */
    public final String f236259d;

    public v150(AdsModeModel$Format adsModeModel$Format, AdsModeModel$Product adsModeModel$Product, String str, String str2) {
        this.f236256a = adsModeModel$Format;
        this.f236257b = adsModeModel$Product;
        this.f236258c = str;
        this.f236259d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v150)) {
            return false;
        }
        v150 v150Var = (v150) obj;
        return this.f236256a == v150Var.f236256a && this.f236257b == v150Var.f236257b && wj50.m88271j(this.f236258c, v150Var.f236258c) && wj50.m88271j(this.f236259d, v150Var.f236259d);
    }

    public final int hashCode() {
        return this.f236259d.hashCode() + s571.m77243b((this.f236257b.hashCode() + (this.f236256a.hashCode() * 31)) * 31, 31, this.f236258c);
    }
}
