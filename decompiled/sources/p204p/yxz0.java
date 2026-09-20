package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class yxz0 implements zxz0 {

    /* JADX INFO: renamed from: a */
    public final List f277367a;

    /* JADX INFO: renamed from: b */
    public final meb f277368b;

    /* JADX INFO: renamed from: c */
    public final htz0 f277369c;

    /* JADX INFO: renamed from: d */
    public bv40 f277370d = null;

    public yxz0(ArrayList arrayList, htz0 htz0Var, meb mebVar) {
        this.f277367a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f277368b = mebVar;
        this.f277369c = htz0Var;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: a */
    public final List mo92388a() {
        return this.f277367a;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: b */
    public final void mo92389b(bv40 bv40Var) {
        this.f277370d = bv40Var;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: c */
    public final Object mo92390c() {
        return null;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: d */
    public final bv40 mo92391d() {
        return this.f277370d;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: e */
    public final Executor mo92392e() {
        return this.f277369c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yxz0) {
            yxz0 yxz0Var = (yxz0) obj;
            List list = yxz0Var.f277367a;
            if (Objects.equals(this.f277370d, yxz0Var.f277370d)) {
                List list2 = this.f277367a;
                if (list2.size() == list.size()) {
                    for (int i = 0; i < list2.size(); i++) {
                        if (((zyl0) list2.get(i)).equals(list.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: f */
    public final int mo92393f() {
        return 0;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: g */
    public final CameraCaptureSession.StateCallback mo92394g() {
        return this.f277368b;
    }

    public final int hashCode() {
        int iHashCode = this.f277367a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        bv40 bv40Var = this.f277370d;
        int iHashCode2 = (bv40Var == null ? 0 : bv40Var.f31273a.f286341a.hashCode()) ^ i;
        return (iHashCode2 << 5) - iHashCode2;
    }

    @Override // p204p.zxz0
    /* JADX INFO: renamed from: h */
    public final void mo92395h(CaptureRequest captureRequest) {
    }
}
