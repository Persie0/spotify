package p204p;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class owo implements mn3 {

    /* JADX INFO: renamed from: b */
    public int f170743b;

    /* JADX INFO: renamed from: c */
    public int f170744c;

    /* JADX INFO: renamed from: e */
    public boolean f170746e = true;

    /* JADX INFO: renamed from: a */
    public int f170742a = 65536;

    /* JADX INFO: renamed from: d */
    public int f170745d = 0;

    /* JADX INFO: renamed from: f */
    public Object f170747f = new vl3[100];

    @Override // p204p.mn3
    /* JADX INFO: renamed from: a */
    public synchronized vl3 mo62342a() {
        vl3 vl3Var;
        try {
            int i = this.f170744c + 1;
            this.f170744c = i;
            int i2 = this.f170745d;
            if (i2 > 0) {
                vl3[] vl3VarArr = (vl3[]) this.f170747f;
                int i3 = i2 - 1;
                this.f170745d = i3;
                vl3Var = vl3VarArr[i3];
                vl3Var.getClass();
                ((vl3[]) this.f170747f)[this.f170745d] = null;
            } else {
                vl3 vl3Var2 = new vl3(new byte[this.f170742a], 0);
                vl3[] vl3VarArr2 = (vl3[]) this.f170747f;
                if (i > vl3VarArr2.length) {
                    this.f170747f = (vl3[]) Arrays.copyOf(vl3VarArr2, vl3VarArr2.length * 2);
                }
                vl3Var = vl3Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return vl3Var;
    }

    @Override // p204p.mn3
    /* JADX INFO: renamed from: b */
    public synchronized void mo62343b(iha ihaVar) {
        while (ihaVar != null) {
            vl3[] vl3VarArr = (vl3[]) this.f170747f;
            int i = this.f170745d;
            this.f170745d = i + 1;
            vl3 vl3Var = (vl3) ihaVar.f102217c;
            vl3Var.getClass();
            vl3VarArr[i] = vl3Var;
            this.f170744c--;
            ihaVar = (iha) ihaVar.f102218d;
            if (ihaVar == null || ((vl3) ihaVar.f102217c) == null) {
                ihaVar = null;
            }
        }
    }

    @Override // p204p.mn3
    /* JADX INFO: renamed from: c */
    public synchronized void mo62344c() {
        int iMax = Math.max(0, h0b1.m46311g(this.f170743b, this.f170742a) - this.f170744c);
        int i = this.f170745d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((vl3[]) this.f170747f, iMax, i, (Object) null);
        this.f170745d = iMax;
    }

    @Override // p204p.mn3
    /* JADX INFO: renamed from: d */
    public synchronized void mo62345d(vl3 vl3Var) {
        vl3[] vl3VarArr = (vl3[]) this.f170747f;
        int i = this.f170745d;
        this.f170745d = i + 1;
        vl3VarArr[i] = vl3Var;
        this.f170744c--;
    }

    @Override // p204p.mn3
    /* JADX INFO: renamed from: e */
    public int mo62346e() {
        return this.f170742a;
    }

    /* JADX INFO: renamed from: f */
    public void m68176f(RecyclerView recyclerView) {
        int i = this.f170745d;
        if (i >= 0) {
            this.f170745d = -1;
            recyclerView.m1002a0(i);
            this.f170746e = false;
        } else if (this.f170746e) {
            Interpolator interpolator = (Interpolator) this.f170747f;
            if (interpolator != null && this.f170744c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f170744c;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f1191C1.m33204c(this.f170742a, this.f170743b, i2, interpolator);
            this.f170746e = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m68177g(int i) {
        boolean z = i < this.f170743b;
        this.f170743b = i;
        if (z) {
            mo62344c();
        }
    }
}
