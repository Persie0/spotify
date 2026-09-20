package p204p;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ojp implements alc1 {

    /* JADX INFO: renamed from: d */
    public static final int[] f166106d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a */
    public boolean f166107a;

    /* JADX INFO: renamed from: b */
    public int f166108b;

    /* JADX INFO: renamed from: c */
    public Object f166109c;

    public /* synthetic */ ojp(boolean z) {
    }

    /* JADX INFO: renamed from: b */
    public static final void m67115b(ojp ojpVar) {
        jpi0 jpi0Var = (jpi0) ojpVar.f166109c;
        int i = jpi0Var.f114676b;
        Object[] objArr = jpi0Var.f114675a;
        b450 b450VarM63417Y = n0e1.m63417Y(0, i);
        int i2 = b450VarM63417Y.f278778a;
        int i3 = b450VarM63417Y.f278779b;
        int i4 = 0;
        if (i2 <= i3) {
            while (true) {
                objArr[i2 - i4] = objArr[i2];
                if (!((gqk0) objArr[i2]).f83488b) {
                    i4++;
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        Arrays.fill(objArr, i - i4, i, (Object) null);
        jpi0Var.f114676b -= i4;
        ojpVar.f166107a = false;
    }

    /* JADX INFO: renamed from: c */
    public static void m67116c(int i, ArrayList arrayList) {
        if (k0e1.m54967B(i, 0, 7, f166106d) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: a */
    public void mo26286a(View view) {
        this.f166107a = true;
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: d */
    public void mo26287d(View view) {
        if (this.f166107a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f166109c;
        actionBarContextView.f119f = null;
        super/*android.view.View*/.setVisibility(this.f166108b);
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: e */
    public void mo26288e() {
        super/*android.view.View*/.setVisibility(0);
        this.f166107a = false;
    }

    /* JADX INFO: renamed from: f */
    public wpp m67117f() {
        c95.m31855u(!this.f166107a);
        wpp wppVar = new wpp(this);
        this.f166107a = true;
        return wppVar;
    }

    /* JADX INFO: renamed from: g */
    public r300 m67118g(r300 r300Var) {
        if (!this.f166107a || !((t46) this.f166109c).mo45920g(r300Var)) {
            return r300Var;
        }
        p300 p300VarM74564a = r300Var.m74564a();
        String str = r300Var.f195383l;
        p300VarM74564a.f173527o = def0.m35799p("application/x-media3-cues");
        p300VarM74564a.f173509P = ((t46) this.f166109c).mo45919b(r300Var);
        StringBuilder sb = new StringBuilder();
        sb.append(r300Var.f195387p);
        sb.append(str != null ? " ".concat(str) : "");
        p300VarM74564a.f173523k = sb.toString();
        p300VarM74564a.f173532t = Long.MAX_VALUE;
        return new r300(p300VarM74564a);
    }

    public ojp(jd21 jd21Var, int i, boolean z) {
        this.f166109c = jd21Var;
        this.f166108b = i;
        this.f166107a = z;
    }

    public ojp(int i, boolean z, pjq pjqVar) {
        this.f166108b = i;
        this.f166107a = z;
        this.f166109c = pjqVar;
    }

    public ojp(Context context) {
        this.f166109c = context;
        int i = wpp.f253802c;
        this.f166108b = R.string.default_notification_channel_name;
    }

    public ojp(frx0 frx0Var) {
        nox0 nox0Var = nox0.f156805g;
        this.f166108b = frx0Var.f72676a;
        this.f166109c = frx0Var.f72677b;
        this.f166107a = frx0Var.f72678c;
    }
}
