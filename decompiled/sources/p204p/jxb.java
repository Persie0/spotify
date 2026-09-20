package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jxb implements kxb {

    /* JADX INFO: renamed from: a */
    public final fxb f117086a;

    /* JADX INFO: renamed from: b */
    public final List f117087b;

    /* JADX INFO: renamed from: c */
    public final y8z0 f117088c = y8z0.f270449a;

    /* JADX INFO: renamed from: d */
    public final int f117089d = 1;

    public jxb(fxb fxbVar) {
        this.f117086a = fxbVar;
        this.f117087b = Collections.singletonList(fxbVar);
    }

    @Override // p204p.kxb
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ dxb mo51867a() {
        return null;
    }

    @Override // p204p.kxb
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ t8z0 mo51868b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxb) && wj50.m88271j(this.f117086a, ((jxb) obj).f117086a);
    }

    @Override // p204p.kxb
    public final /* bridge */ /* synthetic */ String getId() {
        return null;
    }

    @Override // p204p.kxb
    public final List getItems() {
        return this.f117087b;
    }

    @Override // p204p.kxb
    public final int getKind() {
        return this.f117089d;
    }

    @Override // p204p.kxb
    public final /* bridge */ /* synthetic */ String getTitle() {
        return null;
    }

    @Override // p204p.kxb
    public final /* bridge */ /* synthetic */ String getUri() {
        return null;
    }

    public final int hashCode() {
        return this.f117086a.hashCode();
    }

    @Override // p204p.kxb
    /* JADX INFO: renamed from: x */
    public final y8z0 mo51869x() {
        return this.f117088c;
    }
}
