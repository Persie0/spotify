package p204p;

import android.net.Uri;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class kfb implements yf0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mfb f122118b;

    public /* synthetic */ kfb(mfb mfbVar, int i) {
        this.f122117a = i;
        this.f122118b = mfbVar;
    }

    @Override // p204p.yf0
    /* JADX INFO: renamed from: a */
    public final void mo25836a(Object obj) {
        switch (this.f122117a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hwb gwbVar = dwb.f53662a;
                mfb mfbVar = this.f122118b;
                if (zBooleanValue) {
                    Uri uri = mfbVar.f143010d;
                    if (uri != null) {
                        gwbVar = new gwb(uri);
                    }
                } else {
                    Uri uri2 = mfbVar.f143010d;
                    if (uri2 != null) {
                    }
                    File file = mfbVar.f143011e;
                    if (file != null) {
                        file.delete();
                    }
                }
                mfbVar.f143010d = null;
                mfbVar.f143011e = null;
                mfbVar.m61625f(gwbVar);
                return;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                mfb mfbVar2 = this.f122118b;
                if (!zBooleanValue2) {
                    mfbVar2.m61625f(!ze0.m95955u0(mfbVar2.f143008b, "android.permission.CAMERA") ? fwb.f74038a : ewb.f63490a);
                    return;
                }
                int i = mfbVar2.f143012f;
                int i2 = i == 0 ? -1 : lfb.f132882a[edb.m38547C(i)];
                if (i2 != -1) {
                    if (i2 == 1) {
                        mfbVar2.m61621b();
                        return;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mfbVar2.m61622c();
                        return;
                    }
                }
                return;
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                hwb gwbVar2 = dwb.f53662a;
                mfb mfbVar3 = this.f122118b;
                if (zBooleanValue3) {
                    Uri uri3 = mfbVar3.f143010d;
                    if (uri3 != null) {
                        gwbVar2 = new gwb(uri3);
                    }
                } else {
                    Uri uri4 = mfbVar3.f143010d;
                    if (uri4 != null) {
                    }
                    File file2 = mfbVar3.f143011e;
                    if (file2 != null) {
                        file2.delete();
                    }
                }
                mfbVar3.f143010d = null;
                mfbVar3.f143011e = null;
                mfbVar3.m61625f(gwbVar2);
                return;
        }
    }
}
