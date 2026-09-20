package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h481 {

    /* JADX INFO: renamed from: a */
    public final Context f87465a;

    /* JADX INFO: renamed from: b */
    public final Object f87466b;

    /* JADX INFO: renamed from: c */
    public final Object f87467c;

    /* JADX INFO: renamed from: d */
    public final Object f87468d;

    /* JADX INFO: renamed from: e */
    public final Object f87469e;

    /* JADX INFO: renamed from: f */
    public final Object f87470f;

    /* JADX INFO: renamed from: g */
    public final Object f87471g;

    public h481(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f87468d = layoutParams;
        this.f87469e = new Rect();
        this.f87470f = new int[2];
        this.f87471g = new int[2];
        this.f87465a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f87466b = viewInflate;
        this.f87467c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(h481.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public h481(Context context, dii diiVar, o0e1 o0e1Var, mir0 mir0Var, WorkDatabase workDatabase, i1e1 i1e1Var, ArrayList arrayList) {
        this.f87466b = diiVar;
        this.f87467c = o0e1Var;
        this.f87468d = mir0Var;
        this.f87469e = workDatabase;
        this.f87470f = i1e1Var;
        this.f87471g = arrayList;
        this.f87465a = context.getApplicationContext();
        new red1(5);
    }
}
