package p204p;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes10.dex */
public class ype implements wbz0 {

    /* JADX INFO: renamed from: a */
    public int f274912a;

    /* JADX INFO: renamed from: b */
    public boolean f274913b;

    /* JADX INFO: renamed from: c */
    public final Object f274914c;

    /* JADX INFO: renamed from: d */
    public Object f274915d;

    /* JADX INFO: renamed from: e */
    public Object f274916e;

    /* JADX INFO: renamed from: f */
    public Object f274917f;

    /* JADX INFO: renamed from: g */
    public Object f274918g;

    /* JADX INFO: renamed from: h */
    public Object f274919h;

    /* JADX INFO: renamed from: i */
    public Object f274920i;

    public ype(boolean z, int i, luk lukVar, luk lukVar2, s611 s611Var, p4p p4pVar, bc21 bc21Var, xre xreVar, a9i0 a9i0Var) {
        this.f274913b = z;
        this.f274912a = i;
        this.f274914c = lukVar;
        this.f274915d = lukVar2;
        this.f274916e = s611Var;
        this.f274917f = p4pVar;
        this.f274918g = bc21Var;
        this.f274919h = xreVar;
        this.f274920i = a9i0Var;
    }

    /* JADX INFO: renamed from: a */
    public pan0 mo72469a() {
        pan0 pan0VarMo72470b = mo72470b();
        pan0VarMo72470b.setCancelable(true);
        pan0VarMo72470b.setOnCancelListener((uqo0) this.f274919h);
        pan0VarMo72470b.setOnDismissListener((DialogInterface.OnDismissListener) this.f274920i);
        ehr ehrVar = new ehr(pan0VarMo72470b.getContext(), this.f274913b);
        CharSequence charSequence = (CharSequence) this.f274917f;
        if (charSequence != null) {
            dtz dtzVar = new dtz(this, pan0VarMo72470b, false, 21);
            ehrVar.f59643O0 = charSequence;
            ehrVar.f59644P0 = dtzVar;
            ehrVar.f59651g.setVisibility(0);
            ehrVar.f59648d.setVisibility(8);
            ehrVar.f59647c.setVisibility(8);
            if (ehrVar.f59643O0 != null) {
                Button button = ehrVar.f59649e;
                button.setVisibility(0);
                ehrVar.f59650f.setVisibility(8);
                button.setText(ehrVar.f59643O0);
                button.setOnClickListener(ehrVar.f59644P0);
                ehrVar.f59645a = button;
                ehrVar.f59646b = null;
            }
        }
        CharSequence charSequence2 = (CharSequence) this.f274915d;
        if (charSequence2 != null) {
            ehrVar.setTitle(charSequence2);
        }
        CharSequence charSequence3 = (CharSequence) this.f274916e;
        if (charSequence3 != null) {
            ehrVar.setBody(charSequence3);
        }
        ehrVar.getNegativeButton();
        int i = pan0.f175581a;
        ehrVar.getPositiveButton();
        pan0VarMo72470b.setContentView(ehrVar);
        return pan0VarMo72470b;
    }

    /* JADX INFO: renamed from: b */
    public pan0 mo72470b() {
        return new pan0((Context) this.f274914c, this.f274912a);
    }

    /* JADX INFO: renamed from: c */
    public void m94300c(int i, boolean z) {
        this.f274913b = z;
        if (!z) {
            ((kv91) this.f274917f).mo57453r(new szg0(((xt91) this.f274918g).mo24361d()).m79750e(Integer.valueOf(i), Integer.valueOf(this.f274912a)), null);
            ((lwr) this.f274919h).m60127a(((p8p0) this.f274914c).mo48412a(new z7p0(i)).subscribe(faq.f67606Z0, faq.f67607a1));
        }
        xbz0 xbz0Var = (xbz0) this.f274920i;
        if (xbz0Var != null) {
            xbz0Var.setPositionText(i);
        } else {
            wj50.m88260d0("viewBinder");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m94301d(xbz0 xbz0Var) {
        lwr lwrVar = (lwr) this.f274919h;
        this.f274920i = xbz0Var;
        xbz0Var.setListener(this);
        xbz0 xbz0Var2 = (xbz0) this.f274920i;
        if (xbz0Var2 == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        xbz0Var2.setSeekingEnabled(false);
        lwrVar.m60127a(((Flowable) this.f274915d).subscribe(new y9y(this, 0)));
        lwrVar.m60127a(((Flowable) this.f274916e).subscribe(new y9y(this, 1)));
    }

    /* JADX INFO: renamed from: e */
    public void m94302e() {
        xbz0 xbz0Var = (xbz0) this.f274920i;
        if (xbz0Var == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        xbz0Var.setListener(null);
        ((lwr) this.f274919h).m60129c();
    }

    /* JADX INFO: renamed from: f */
    public ype mo72471f() {
        this.f274916e = ((Context) this.f274914c).getResources().getText(R.string.itgc_failure_dialog_body);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ype mo72472g(DialogInterface.OnClickListener onClickListener) {
        this.f274917f = ((Context) this.f274914c).getResources().getText(R.string.itgc_failure_dialog_dismiss_button);
        this.f274918g = (nmb) onClickListener;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public ype mo72473h() {
        this.f274915d = ((Context) this.f274914c).getResources().getText(R.string.itgc_failure_dialog_title);
        return this;
    }

    public ype(p8p0 p8p0Var, Flowable flowable, Flowable flowable2, kv91 kv91Var, xt91 xt91Var) {
        this.f274914c = p8p0Var;
        this.f274915d = flowable;
        this.f274916e = flowable2;
        this.f274917f = kv91Var;
        this.f274918g = xt91Var;
        this.f274919h = new lwr();
    }

    public ype(Context context, int i) {
        this.f274914c = context;
        this.f274912a = i;
    }
}
