package p204p;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class qh41 {

    /* JADX INFO: renamed from: a */
    public int f188625a;

    /* JADX INFO: renamed from: b */
    public int f188626b;

    /* JADX INFO: renamed from: c */
    public boolean f188627c;

    /* JADX INFO: renamed from: d */
    public boolean f188628d;

    /* JADX INFO: renamed from: e */
    public boolean f188629e;

    /* JADX INFO: renamed from: f */
    public int[] f188630f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f188631g;

    public qh41(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f188631g = staggeredGridLayoutManager;
        m72785a();
    }

    /* JADX INFO: renamed from: a */
    public final void m72785a() {
        this.f188625a = -1;
        this.f188626b = Integer.MIN_VALUE;
        this.f188627c = false;
        this.f188628d = false;
        this.f188629e = false;
        int[] iArr = this.f188630f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
