package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rj21 implements xj21 {

    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ rj21[] f199695L0;

    /* JADX INFO: renamed from: X */
    public static final cj21 f199696X;

    /* JADX INFO: renamed from: Y */
    public static final dj21 f199697Y;

    /* JADX INFO: renamed from: Z */
    public static final ej21 f199698Z;

    /* JADX INFO: renamed from: a */
    public static final ij21 f199699a;

    /* JADX INFO: renamed from: b */
    public static final jj21 f199700b;

    /* JADX INFO: renamed from: c */
    public static final lj21 f199701c;

    /* JADX INFO: renamed from: d */
    public static final mj21 f199702d;

    /* JADX INFO: renamed from: e */
    public static final nj21 f199703e;

    /* JADX INFO: renamed from: f */
    public static final oj21 f199704f;

    /* JADX INFO: renamed from: g */
    public static final pj21 f199705g;

    /* JADX INFO: renamed from: h */
    public static final qj21 f199706h;

    /* JADX INFO: renamed from: i */
    public static final aj21 f199707i;

    /* JADX INFO: renamed from: t */
    public static final bj21 f199708t;

    static {
        ij21 ij21Var = new ij21();
        f199699a = ij21Var;
        jj21 jj21Var = new jj21();
        f199700b = jj21Var;
        rj21 rj21Var = new rj21() { // from class: p.kj21
            @Override // p204p.xj21
            /* JADX INFO: renamed from: a */
            public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(R.layout.skeleton_headerartwork_small, viewGroup, false);
            }
        };
        lj21 lj21Var = new lj21();
        f199701c = lj21Var;
        mj21 mj21Var = new mj21();
        f199702d = mj21Var;
        nj21 nj21Var = new nj21();
        f199703e = nj21Var;
        oj21 oj21Var = new oj21();
        f199704f = oj21Var;
        pj21 pj21Var = new pj21();
        f199705g = pj21Var;
        qj21 qj21Var = new qj21();
        f199706h = qj21Var;
        rj21 rj21Var2 = new rj21() { // from class: p.zi21
            @Override // p204p.xj21
            /* JADX INFO: renamed from: a */
            public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int iM88766u = wqg1.m88766u(8.0f, context.getResources());
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setPadding(iM88766u, 0, iM88766u, 0);
                layoutInflater.inflate(R.layout.skeleton_card, (ViewGroup) linearLayout, true);
                return linearLayout;
            }
        };
        aj21 aj21Var = new aj21();
        f199707i = aj21Var;
        bj21 bj21Var = new bj21();
        f199708t = bj21Var;
        cj21 cj21Var = new cj21();
        f199696X = cj21Var;
        dj21 dj21Var = new dj21();
        f199697Y = dj21Var;
        ej21 ej21Var = new ej21();
        f199698Z = ej21Var;
        f199695L0 = new rj21[]{ij21Var, jj21Var, rj21Var, lj21Var, mj21Var, nj21Var, oj21Var, pj21Var, qj21Var, rj21Var2, aj21Var, bj21Var, cj21Var, dj21Var, ej21Var, new rj21() { // from class: p.fj21
            @Override // p204p.xj21
            /* JADX INFO: renamed from: a */
            public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(R.layout.skeleton_trackpreview, viewGroup, false);
            }
        }, new rj21() { // from class: p.gj21
            @Override // p204p.xj21
            /* JADX INFO: renamed from: a */
            public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(R.layout.skeleton_trackcloud, viewGroup, false);
            }
        }, new rj21() { // from class: p.hj21
            @Override // p204p.xj21
            /* JADX INFO: renamed from: a */
            public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(R.layout.skeleton_podcastepisoderow, viewGroup, false);
            }
        }};
        values();
    }

    public static rj21 valueOf(String str) {
        return (rj21) Enum.valueOf(rj21.class, str);
    }

    public static rj21[] values() {
        return (rj21[]) f199695L0.clone();
    }
}
