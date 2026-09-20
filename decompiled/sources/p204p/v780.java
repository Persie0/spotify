package p204p;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class v780 {

    /* JADX INFO: renamed from: c */
    public static final int f238096c = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f238097a;

    /* JADX INFO: renamed from: b */
    public final w780 f238098b;

    public v780(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.f238097a = constraintLayout;
        this.f238098b = new w780(constraintLayout);
    }
}
