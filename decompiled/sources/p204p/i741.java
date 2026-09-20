package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i741 {

    /* JADX INFO: renamed from: a */
    public final duc f99425a;

    /* JADX INFO: renamed from: b */
    public final boolean f99426b;

    /* JADX INFO: renamed from: c */
    public final h741 f99427c;

    /* JADX INFO: renamed from: d */
    public final int f99428d;

    public i741(h741 h741Var, boolean z, duc ducVar, int i) {
        this.f99427c = h741Var;
        this.f99426b = z;
        this.f99425a = ducVar;
        this.f99428d = i;
    }

    /* JADX INFO: renamed from: a */
    public static i741 m49832a(char c) {
        return new i741(new dz31(new xtc(c, 0), 1));
    }

    /* JADX INFO: renamed from: b */
    public static i741 m49833b(String str) {
        c95.m31844j(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? m49832a(str.charAt(0)) : new i741(new C2617yl(str, 7));
    }

    /* JADX INFO: renamed from: c */
    public final List m49834c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo37398c = this.f99427c.mo37398c(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            f741 f741Var = (f741) itMo37398c;
            if (!f741Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) f741Var.next());
        }
    }

    public i741(h741 h741Var) {
        this(h741Var, false, utc.f233889f, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
