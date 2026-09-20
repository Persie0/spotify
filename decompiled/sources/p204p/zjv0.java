package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zjv0 {

    /* JADX INFO: renamed from: a */
    public int f283544a;

    /* JADX INFO: renamed from: b */
    public int f283545b;

    /* JADX INFO: renamed from: c */
    public int f283546c;

    /* JADX INFO: renamed from: d */
    public int f283547d;

    /* JADX INFO: renamed from: e */
    public int f283548e;

    /* JADX INFO: renamed from: f */
    public boolean f283549f;

    /* JADX INFO: renamed from: g */
    public boolean f283550g;

    /* JADX INFO: renamed from: h */
    public boolean f283551h;

    /* JADX INFO: renamed from: i */
    public boolean f283552i;

    /* JADX INFO: renamed from: j */
    public boolean f283553j;

    /* JADX INFO: renamed from: k */
    public boolean f283554k;

    /* JADX INFO: renamed from: l */
    public int f283555l;

    /* JADX INFO: renamed from: m */
    public long f283556m;

    /* JADX INFO: renamed from: n */
    public int f283557n;

    /* JADX INFO: renamed from: a */
    public final void m96245a(int i) {
        if ((this.f283547d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f283547d));
    }

    /* JADX INFO: renamed from: b */
    public final int m96246b() {
        return this.f283550g ? this.f283545b - this.f283546c : this.f283548e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f283544a);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f283548e);
        sb.append(", mIsMeasuring=");
        sb.append(this.f283552i);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f283545b);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f283546c);
        sb.append(", mStructureChanged=");
        sb.append(this.f283549f);
        sb.append(", mInPreLayout=");
        sb.append(this.f283550g);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f283553j);
        sb.append(", mRunPredictiveAnimations=");
        return s571.m77253l(sb, this.f283554k, '}');
    }
}
