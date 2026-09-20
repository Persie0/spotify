package p204p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f8u extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final Context f67085c;

    /* JADX INFO: renamed from: d */
    public final View f67086d;

    /* JADX INFO: renamed from: e */
    public final List f67087e;

    /* JADX INFO: renamed from: f */
    public final LinearLayout f67088f;

    /* JADX INFO: renamed from: g */
    public final e8u f67089g;

    /* JADX INFO: renamed from: h */
    public boolean f67090h;

    public f8u(Context context, View view, List list, LinearLayout linearLayout, e8u e8uVar) {
        super(6);
        this.f67085c = context;
        this.f67086d = view;
        this.f67087e = list;
        this.f67088f = linearLayout;
        this.f67089g = e8uVar;
        this.f67090h = true;
        m41043F1();
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: E0 */
    public final void mo38146E0() {
        Context context = this.f67085c;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        AppCompatImageView appCompatImageView = (AppCompatImageView) View.inflate(context, R.layout.emoji_picker_popup_bidirectional, linearLayout).findViewById(R.id.emoji_picker_popup_bidirectional_icon);
        View view = this.f67086d;
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        this.f67088f.addView(linearLayout);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) linearLayout.findViewById(R.id.emoji_picker_popup_bidirectional_icon);
        appCompatImageView2.setOnClickListener(new e8u(0, this, appCompatImageView2));
    }

    /* JADX INFO: renamed from: F1 */
    public final void m41043F1() {
        int[][] iArr;
        boolean z = this.f67090h;
        List list = this.f67087e;
        if (z) {
            b450 b450VarM46713J = h6f.m46713J(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = b450VarM46713J.iterator();
            while (((a450) it).f12141c) {
                Object next = ((t350) it).next();
                if (((Number) next).intValue() % 12 < 6) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it2.next()).intValue() + 1));
            }
            iArr = new int[][]{g6f.m43726i1(arrayList2)};
        } else {
            b450 b450VarM46713J2 = h6f.m46713J(list);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = b450VarM46713J2.iterator();
            while (((a450) it3).f12141c) {
                Object next2 = ((t350) it3).next();
                if (((Number) next2).intValue() % 12 >= 6) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((Number) it4.next()).intValue() + 1));
            }
            iArr = new int[][]{g6f.m43726i1(arrayList4)};
        }
        this.f57320b = iArr;
        int iMo38164d1 = mo38164d1() - 1;
        int[][] iArr2 = new int[iMo38164d1][];
        for (int i = 0; i < iMo38164d1; i++) {
            iArr2[i] = new int[6];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < iMo38164d1; i3++) {
            for (int i4 = 0; i4 < 6; i4++) {
                if (i2 < m38170j1()[0].length) {
                    iArr2[i3][i4] = m38170j1()[0][i2];
                    i2++;
                }
            }
        }
        this.f57320b = iArr2;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: Y0 */
    public final Context mo38159Y0() {
        return this.f67085c;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: a1 */
    public final View.OnClickListener mo38161a1() {
        return this.f67089g;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: c1 */
    public final int mo38163c1() {
        return 6;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: d1 */
    public final int mo38164d1() {
        return ((this.f67087e.size() / 2) / 6) + 1;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: g1 */
    public final LinearLayout mo38167g1() {
        return this.f67088f;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: h1 */
    public final View mo38168h1() {
        return this.f67086d;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: m1 */
    public final List mo38171m1() {
        return this.f67087e;
    }
}
