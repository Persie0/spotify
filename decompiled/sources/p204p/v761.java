package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class v761 {

    /* JADX INFO: renamed from: a */
    public final int f238068a;

    /* JADX INFO: renamed from: b */
    public final Matrix f238069b;

    /* JADX INFO: renamed from: c */
    public final boolean f238070c;

    /* JADX INFO: renamed from: d */
    public final Rect f238071d;

    /* JADX INFO: renamed from: e */
    public final boolean f238072e;

    /* JADX INFO: renamed from: f */
    public final int f238073f;

    /* JADX INFO: renamed from: g */
    public final j28 f238074g;

    /* JADX INFO: renamed from: h */
    public int f238075h;

    /* JADX INFO: renamed from: i */
    public int f238076i;

    /* JADX INFO: renamed from: k */
    public s861 f238078k;

    /* JADX INFO: renamed from: l */
    public u761 f238079l;

    /* JADX INFO: renamed from: j */
    public boolean f238077j = false;

    /* JADX INFO: renamed from: m */
    public final HashSet f238080m = new HashSet();

    /* JADX INFO: renamed from: n */
    public boolean f238081n = false;

    /* JADX INFO: renamed from: o */
    public final ArrayList f238082o = new ArrayList();

    public v761(int i, int i2, j28 j28Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f238073f = i;
        this.f238068a = i2;
        this.f238074g = j28Var;
        this.f238069b = matrix;
        this.f238070c = z;
        this.f238071d = rect;
        this.f238076i = i3;
        this.f238075h = i4;
        this.f238072e = z2;
        this.f238079l = new u761(j28Var.f107950a, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m84841a() {
        wj50.m88281r("Edge is already closed.", !this.f238081n);
    }

    /* JADX INFO: renamed from: b */
    public final void m84842b() {
        hxg1.m49006s();
        this.f238079l.mo61983a();
        this.f238081n = true;
    }

    /* JADX INFO: renamed from: c */
    public final s861 m84843c(ifb ifbVar, boolean z) {
        hxg1.m49006s();
        m84841a();
        j28 j28Var = this.f238074g;
        s861 s861Var = new s861(j28Var.f107950a, ifbVar, z, j28Var.f107951b, new r761(this, 0));
        try {
            ue40 ue40Var = s861Var.f206586k;
            u761 u761Var = this.f238079l;
            Objects.requireNonNull(u761Var);
            if (u761Var.m82505g(ue40Var, new s761(u761Var, 0))) {
                x4w0.m89920K(u761Var.f144309e).mo28322a(new ljq(ue40Var, 1), e95.m38202g());
            }
            this.f238078k = s861Var;
            m84845e();
            return s861Var;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            s861Var.m77464c();
            throw e2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m84844d() {
        boolean z;
        hxg1.m49006s();
        m84841a();
        u761 u761Var = this.f238079l;
        u761Var.getClass();
        hxg1.m49006s();
        if (u761Var.f227523q == null) {
            synchronized (u761Var.f144305a) {
                z = u761Var.f144307c;
            }
            if (!z) {
                return;
            }
        }
        this.f238077j = false;
        this.f238079l.mo61983a();
        this.f238079l = new u761(this.f238074g.f107950a, this.f238068a);
        Iterator it = this.f238080m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m84845e() {
        r861 r861Var;
        Executor executor;
        hxg1.m49006s();
        p28 p28Var = new p28(this.f238071d, this.f238076i, this.f238075h, this.f238070c, this.f238069b, this.f238072e);
        s861 s861Var = this.f238078k;
        if (s861Var != null) {
            synchronized (s861Var.f206576a) {
                s861Var.f206587l = p28Var;
                r861Var = s861Var.f206588m;
                executor = s861Var.f206589n;
            }
            if (r861Var != null && executor != null) {
                executor.execute(new n861(r861Var, p28Var, 0));
            }
        }
        Iterator it = this.f238082o.iterator();
        while (it.hasNext()) {
            ((y8j) it.next()).accept(p28Var);
        }
    }
}
