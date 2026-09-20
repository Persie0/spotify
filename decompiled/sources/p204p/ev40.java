package p204p;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ev40 implements fv40 {

    /* JADX INFO: renamed from: a */
    public final InputContentInfo f63139a;

    public ev40(Object obj) {
        this.f63139a = (InputContentInfo) obj;
    }

    @Override // p204p.fv40
    /* JADX INFO: renamed from: a */
    public final Uri mo40090a() {
        return this.f63139a.getContentUri();
    }

    @Override // p204p.fv40
    /* JADX INFO: renamed from: b */
    public final Uri mo40091b() {
        return this.f63139a.getLinkUri();
    }

    @Override // p204p.fv40
    /* JADX INFO: renamed from: c */
    public final Object mo40092c() {
        return this.f63139a;
    }

    @Override // p204p.fv40
    /* JADX INFO: renamed from: d */
    public final void mo40093d() {
        this.f63139a.requestPermission();
    }

    @Override // p204p.fv40
    public final ClipDescription getDescription() {
        return this.f63139a.getDescription();
    }

    public ev40(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f63139a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
