package p204p;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class xgz {

    /* JADX INFO: renamed from: a */
    public int f261395a;

    /* JADX INFO: renamed from: b */
    public int f261396b;

    /* JADX INFO: renamed from: c */
    public int f261397c;

    /* JADX INFO: renamed from: d */
    public int f261398d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f261399e;

    /* JADX INFO: renamed from: f */
    public boolean f261400f;

    /* JADX INFO: renamed from: g */
    public boolean f261401g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ FlexboxLayoutManager f261402h;

    public xgz(FlexboxLayoutManager flexboxLayoutManager) {
        this.f261402h = flexboxLayoutManager;
    }

    /* JADX INFO: renamed from: a */
    public static void m90938a(xgz xgzVar) {
        FlexboxLayoutManager flexboxLayoutManager = xgzVar.f261402h;
        if (flexboxLayoutManager.mo1441k() || !flexboxLayoutManager.f1696T0) {
            xgzVar.f261397c = xgzVar.f261399e ? flexboxLayoutManager.f1704b1.mo34600i() : flexboxLayoutManager.f1704b1.mo34604m();
        } else {
            xgzVar.f261397c = xgzVar.f261399e ? flexboxLayoutManager.f1704b1.mo34600i() : flexboxLayoutManager.f1288M0 - flexboxLayoutManager.f1704b1.mo34604m();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m90939b(xgz xgzVar) {
        xgzVar.f261395a = -1;
        xgzVar.f261396b = -1;
        xgzVar.f261397c = Integer.MIN_VALUE;
        xgzVar.f261400f = false;
        xgzVar.f261401g = false;
        FlexboxLayoutManager flexboxLayoutManager = xgzVar.f261402h;
        if (flexboxLayoutManager.mo1441k()) {
            int i = flexboxLayoutManager.f1692P0;
            if (i == 0) {
                xgzVar.f261399e = flexboxLayoutManager.f1691O0 == 1;
                return;
            } else {
                xgzVar.f261399e = i == 2;
                return;
            }
        }
        int i2 = flexboxLayoutManager.f1692P0;
        if (i2 == 0) {
            xgzVar.f261399e = flexboxLayoutManager.f1691O0 == 3;
        } else {
            xgzVar.f261399e = i2 == 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f261395a);
        sb.append(", mFlexLinePosition=");
        sb.append(this.f261396b);
        sb.append(", mCoordinate=");
        sb.append(this.f261397c);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.f261398d);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f261399e);
        sb.append(", mValid=");
        sb.append(this.f261400f);
        sb.append(", mAssignedFromSavedState=");
        return s571.m77253l(sb, this.f261401g, '}');
    }
}
