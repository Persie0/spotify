package p204p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i8u extends AbstractC1806e9 {

    /* JADX INFO: renamed from: i */
    public static final int[][] f99839i = {new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f99840c;

    /* JADX INFO: renamed from: d */
    public final Context f99841d;

    /* JADX INFO: renamed from: e */
    public final View f99842e;

    /* JADX INFO: renamed from: f */
    public final List f99843f;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f99844g;

    /* JADX INFO: renamed from: h */
    public final e8u f99845h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8u(Context context, View view, List list, LinearLayout linearLayout, e8u e8uVar, int i) {
        super(6);
        this.f99840c = i;
        switch (i) {
            case 1:
                super(6);
                this.f99841d = context;
                this.f99842e = view;
                this.f99843f = list;
                this.f99844g = linearLayout;
                this.f99845h = e8uVar;
                b450 b450VarM46713J = h6f.m46713J(list);
                ArrayList arrayList = new ArrayList(i6f.m49804T(b450VarM46713J, 10));
                Iterator it = b450VarM46713J.iterator();
                while (((a450) it).f12141c) {
                    arrayList.add(Integer.valueOf(((t350) it).nextInt() + 1));
                }
                this.f57320b = new int[][]{g6f.m43726i1(arrayList)};
                int iMo38164d1 = mo38164d1();
                int iMo38163c1 = mo38163c1();
                int[][] iArr = new int[iMo38164d1][];
                for (int i2 = 0; i2 < iMo38164d1; i2++) {
                    iArr[i2] = new int[iMo38163c1];
                }
                int i3 = 0;
                for (int i4 = 0; i4 < iMo38164d1; i4++) {
                    for (int i5 = 0; i5 < iMo38163c1; i5++) {
                        if (i3 < m38170j1()[0].length) {
                            iArr[i4][i5] = m38170j1()[0][i3];
                            i3++;
                        }
                    }
                }
                this.f57320b = iArr;
                break;
            default:
                this.f99841d = context;
                this.f99842e = view;
                this.f99843f = list;
                this.f99844g = linearLayout;
                this.f99845h = e8uVar;
                this.f57320b = f99839i;
                break;
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: Y0 */
    public final Context mo38159Y0() {
        switch (this.f99840c) {
            case 0:
                break;
        }
        return this.f99841d;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: a1 */
    public final View.OnClickListener mo38161a1() {
        switch (this.f99840c) {
            case 0:
                break;
        }
        return this.f99845h;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: c1 */
    public final int mo38163c1() {
        switch (this.f99840c) {
            case 0:
                return f99839i[0].length;
            default:
                return Math.min(6, m38170j1()[0].length);
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: d1 */
    public final int mo38164d1() {
        switch (this.f99840c) {
            case 0:
                return 5;
            default:
                int iMo38163c1 = mo38163c1();
                List list = this.f99843f;
                return (list.size() / iMo38163c1) + (list.size() % iMo38163c1 == 0 ? 0 : 1);
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: g1 */
    public final LinearLayout mo38167g1() {
        switch (this.f99840c) {
            case 0:
                break;
        }
        return this.f99844g;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: h1 */
    public final View mo38168h1() {
        switch (this.f99840c) {
            case 0:
                break;
        }
        return this.f99842e;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: m1 */
    public final List mo38171m1() {
        switch (this.f99840c) {
            case 0:
                break;
        }
        return this.f99843f;
    }
}
