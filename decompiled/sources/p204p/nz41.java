package p204p;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nz41 implements uio {

    /* JADX INFO: renamed from: a */
    public final uio f159995a;

    /* JADX INFO: renamed from: b */
    public long f159996b;

    /* JADX INFO: renamed from: c */
    public Uri f159997c;

    /* JADX INFO: renamed from: d */
    public Map f159998d;

    public nz41(uio uioVar) {
        uioVar.getClass();
        this.f159995a = uioVar;
        this.f159997c = Uri.EMPTY;
        this.f159998d = Collections.EMPTY_MAP;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: a */
    public final void mo29278a(x491 x491Var) {
        x491Var.getClass();
        this.f159995a.mo29278a(x491Var);
    }

    @Override // p204p.uio
    public final void close() {
        this.f159995a.close();
    }

    /* JADX INFO: renamed from: d */
    public final long m65913d() {
        return this.f159996b;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: e */
    public final Map mo28172e() {
        return this.f159995a.mo28172e();
    }

    /* JADX INFO: renamed from: f */
    public final Uri m65914f() {
        return this.f159997c;
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f159995a.getUri();
    }

    /* JADX INFO: renamed from: j */
    public final Map m65915j() {
        return this.f159998d;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f159995a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f159996b += (long) i3;
        }
        return i3;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) {
        uio uioVar = this.f159995a;
        this.f159997c = sjoVar.f209885a;
        this.f159998d = Collections.EMPTY_MAP;
        try {
            return uioVar.mo28175u(sjoVar);
        } finally {
            Uri uri = uioVar.getUri();
            if (uri != null) {
                this.f159997c = uri;
            }
            this.f159998d = uioVar.mo28172e();
        }
    }
}
