package p204p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class k8u extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final Set f120429e = Collections.singleton("👪");

    /* JADX INFO: renamed from: a */
    public final View f120430a;

    /* JADX INFO: renamed from: b */
    public final List f120431b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f120432c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1806e9 f120433d;

    public k8u(Context context, View view, e9u e9uVar, e8u e8uVar) {
        AbstractC1806e9 i8uVar;
        super(context, null, 0);
        this.f120430a = view;
        List list = e9uVar.f57535b;
        this.f120431b = list;
        String str = e9uVar.f57534a;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.variant_popup, null).findViewById(R.id.variant_popup);
        this.f120432c = linearLayout;
        int iOrdinal = getLayout().ordinal();
        if (iOrdinal == 0) {
            i8uVar = new i8u(context, view, list, linearLayout, e8uVar, 1);
        } else if (iOrdinal == 1) {
            i8uVar = new i8u(context, view, list, linearLayout, e8uVar, 0);
        } else if (iOrdinal == 2) {
            i8uVar = new h8u(context, view, list, linearLayout, e8uVar, str);
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i8uVar = new f8u(context, view, list, linearLayout, e8uVar);
        }
        this.f120433d = i8uVar;
        i8uVar.mo38146E0();
        i8uVar.mo38148F0();
        i8uVar.mo38144D0();
        addView(linearLayout);
    }

    private final j8u getLayout() {
        List list = this.f120431b;
        if (list.size() == 26) {
            return f120429e.contains(list.get(0)) ? j8u.f110008b : j8u.f110009c;
        }
        return list.size() == 36 ? j8u.f110010d : j8u.f110007a;
    }

    public final int getPopupViewHeight() {
        int height = this.f120430a.getHeight() * this.f120433d.mo38164d1();
        LinearLayout linearLayout = this.f120432c;
        return linearLayout.getPaddingBottom() + linearLayout.getPaddingTop() + height;
    }

    public final int getPopupViewWidth() {
        int width = this.f120430a.getWidth() * this.f120433d.mo38163c1();
        LinearLayout linearLayout = this.f120432c;
        return linearLayout.getPaddingEnd() + linearLayout.getPaddingStart() + width;
    }
}
