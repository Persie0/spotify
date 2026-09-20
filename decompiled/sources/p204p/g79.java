package p204p;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class g79 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f77211d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f77212e;

    /* JADX INFO: renamed from: f */
    public Object f77213f;

    /* JADX INFO: renamed from: g */
    public Serializable f77214g;

    public /* synthetic */ g79() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        switch (this.f77211d) {
            case 0:
                return this.f77213f.size();
            default:
                return ((ArrayList) this.f77213f).size();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public int mo28437g(int i) {
        switch (this.f77211d) {
            case 1:
                return !this.f77212e ? 1 : 0;
            default:
                return super.mo28437g(i);
        }
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        vc41 vc41VarValueOf;
        int i2 = 0;
        switch (this.f77211d) {
            case 0:
                e79 e79Var = (e79) dkv0Var;
                TextView textView = e79Var.f56870V0;
                ConstraintLayout constraintLayout = e79Var.f56869U0;
                SpotifyIconView spotifyIconView = e79Var.f56867S0;
                try {
                    vc41VarValueOf = vc41.valueOf(((x69) this.f77213f.get(i)).f258611a.toUpperCase(Locale.ROOT));
                } catch (Throwable unused) {
                    vc41VarValueOf = vc41.PLAYLIST;
                }
                spotifyIconView.setIcon(vc41VarValueOf);
                e79Var.f56868T0.setText(((x69) this.f77213f.get(i)).f258612b);
                constraintLayout.setOnClickListener(new f79(this, i, i2));
                if (((x69) this.f77213f.get(i)).f258614d.length() > 0) {
                    spotifyIconView.setColor(Color.parseColor(((x69) this.f77213f.get(i)).f258614d));
                }
                if (((x69) this.f77213f.get(i)).f258615e) {
                    constraintLayout.setBackgroundColor(constraintLayout.getContext().getColor(R.color.benefit_list_row_highlighted_background_color));
                }
                if (((x69) this.f77213f.get(i)).f258613c.length() <= 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(((x69) this.f77213f.get(i)).f258613c);
                }
                break;
            default:
                ymq0 ymq0Var = (ymq0) dkv0Var;
                ArrayList arrayList = (ArrayList) this.f77213f;
                if (ymq0Var instanceof anq0) {
                    anq0 anq0Var = (anq0) ymq0Var;
                    String str = ((bnq0) arrayList.get(i)).f28913a;
                    if (str == null) {
                        str = "";
                    }
                    boolean z = arrayList.size() == 1;
                    TextView textView2 = anq0Var.f17482S0;
                    ConstraintLayout constraintLayout2 = anq0Var.f17484U0;
                    constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), 0);
                    anq0Var.f17483T0.setVisibility(z ? 8 : 0);
                    textView2.setTextAlignment(z ? 4 : 2);
                    textView2.setText(str);
                }
                if (ymq0Var instanceof zmq0) {
                    zmq0 zmq0Var = (zmq0) ymq0Var;
                    bnq0 bnq0Var = (bnq0) arrayList.get(i);
                    ConstraintLayout constraintLayout3 = zmq0Var.f284330T0;
                    constraintLayout3.setPadding(constraintLayout3.getPaddingLeft(), constraintLayout3.getPaddingTop(), constraintLayout3.getPaddingRight(), 0);
                    Object obj = pmu.f179234a;
                    ImageView imageView = zmq0Var.f284329S0;
                    Drawable drawableM70421a = pmu.m70421a(imageView.getResources(), bnq0Var.f28914b, false);
                    String str2 = bnq0Var.f28913a;
                    imageView.setContentDescription(str2);
                    if (drawableM70421a != null) {
                        cnq0 cnq0Var = (cnq0) zmq0Var.f284332V0.f77214g;
                        Resources resources = imageView.getResources();
                        int i3 = cnq0Var.f40073a;
                        ThreadLocal threadLocal = u1x0.f225931a;
                        drawableM70421a.setTint(resources.getColor(i3, null));
                        imageView.setTag(Integer.valueOf(cnq0Var.f40073a));
                        imageView.setImageDrawable(drawableM70421a);
                    }
                    TextView textView3 = zmq0Var.f284331U0;
                    textView3.setText(str2);
                    String str3 = bnq0Var.f28915c;
                    if (str3 != null && str3.length() != 0) {
                        textView3.setTextColor(Color.parseColor(str3));
                        break;
                    }
                }
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        switch (this.f77211d) {
            case 0:
                View viewM25591c = adn.m25591c(viewGroup, this.f77212e ? R.layout.benefit_list_row_highlighted : R.layout.benefit_list_row, viewGroup, false);
                wj50.m88279p(viewM25591c);
                return new e79(viewM25591c);
            default:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                return i == 1 ? new anq0((ViewGroup) layoutInflaterFrom.inflate(R.layout.plan_benefit_item_row, viewGroup, false)) : new zmq0(this, (ViewGroup) layoutInflaterFrom.inflate(R.layout.plan_benefit_with_icon_item_row, viewGroup, false));
        }
    }

    public g79(ArrayList arrayList, boolean z, cnq0 cnq0Var) {
        this.f77213f = arrayList;
        this.f77212e = z;
        this.f77214g = cnq0Var;
    }
}
