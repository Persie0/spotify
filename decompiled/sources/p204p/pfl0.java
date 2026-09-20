package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class pfl0 implements sfl0, nfl0 {

    /* JADX INFO: renamed from: a */
    public final String f177100a;

    /* JADX INFO: renamed from: b */
    public final String f177101b;

    /* JADX INFO: renamed from: c */
    public final String f177102c;

    /* JADX INFO: renamed from: d */
    public final String f177103d;

    /* JADX INFO: renamed from: e */
    public final String f177104e;

    /* JADX INFO: renamed from: f */
    public final String f177105f;

    /* JADX INFO: renamed from: g */
    public final String f177106g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f177107h;

    /* JADX INFO: renamed from: i */
    public final String f177108i;

    public pfl0(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8) {
        this.f177100a = str;
        this.f177101b = str2;
        this.f177102c = str3;
        this.f177103d = str4;
        this.f177104e = str5;
        this.f177105f = str6;
        this.f177106g = str7;
        this.f177107h = arrayList;
        this.f177108i = str8;
    }

    @Override // p204p.nfl0
    /* JADX INFO: renamed from: a */
    public final String mo64344a() {
        return this.f177105f;
    }

    @Override // p204p.sfl0
    /* JADX INFO: renamed from: b */
    public final String mo66853b() {
        return this.f177103d;
    }

    @Override // p204p.nfl0
    /* JADX INFO: renamed from: c */
    public final String mo64345c() {
        return this.f177106g;
    }

    @Override // p204p.nfl0
    /* JADX INFO: renamed from: d */
    public final String mo64346d() {
        return this.f177104e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfl0)) {
            return false;
        }
        pfl0 pfl0Var = (pfl0) obj;
        return this.f177100a.equals(pfl0Var.f177100a) && wj50.m88271j(this.f177101b, pfl0Var.f177101b) && wj50.m88271j(this.f177102c, pfl0Var.f177102c) && wj50.m88271j(this.f177103d, pfl0Var.f177103d) && wj50.m88271j(this.f177104e, pfl0Var.f177104e) && wj50.m88271j(this.f177105f, pfl0Var.f177105f) && wj50.m88271j(this.f177106g, pfl0Var.f177106g) && this.f177107h.equals(pfl0Var.f177107h) && wj50.m88271j(this.f177108i, pfl0Var.f177108i);
    }

    @Override // p204p.sfl0
    public final String getArtist() {
        return this.f177102c;
    }

    @Override // p204p.sfl0
    public final String getArtwork() {
        return this.f177101b;
    }

    @Override // p204p.sfl0
    public final String getTitle() {
        return this.f177100a;
    }

    public final int hashCode() {
        return this.f177108i.hashCode() + lq51.m59700f(this.f177107h, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f177100a.hashCode() * 31, 31, this.f177101b), 31, this.f177102c), 31, this.f177103d), 31, this.f177104e), 31, this.f177105f), 31, this.f177106g), 31);
    }
}
