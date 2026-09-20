package p204p;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class vh2 implements InterfaceC2363s5 {

    /* JADX INFO: renamed from: a */
    public final View f241389a;

    /* JADX INFO: renamed from: b */
    public final vv91 f241390b;

    /* JADX INFO: renamed from: c */
    public final Button f241391c;

    /* JADX INFO: renamed from: d */
    public final DatePicker f241392d;

    /* JADX INFO: renamed from: e */
    public final TextView f241393e;

    /* JADX INFO: renamed from: f */
    public final ProgressBar f241394f;

    /* JADX INFO: renamed from: g */
    public final PublishSubject f241395g;

    public vh2(View view, vv91 vv91Var) {
        this.f241389a = view;
        this.f241390b = vv91Var;
        Button button = (Button) view.findViewById(R.id.age_next_button);
        button.setOnClickListener(new y10(this, 1));
        this.f241391c = button;
        DatePicker datePicker = (DatePicker) view.findViewById(R.id.datePicker);
        datePicker.setMaxDate(new Date().getTime());
        this.f241392d = datePicker;
        this.f241393e = (TextView) view.findViewById(R.id.age_error_message);
        this.f241394f = (ProgressBar) view.findViewById(R.id.age_verification_progress_bar);
        this.f241395g = new PublishSubject();
    }

    /* JADX INFO: renamed from: d */
    public static final void m85504d(vh2 vh2Var, ic2 ic2Var) {
        String string;
        Button button = vh2Var.f241391c;
        ProgressBar progressBar = vh2Var.f241394f;
        TextView textView = vh2Var.f241393e;
        he2 he2Var = ic2Var.f100710d;
        if ((he2Var instanceof fe2) || (he2Var instanceof ee2)) {
            textView.setVisibility(4);
            progressBar.setVisibility(8);
            button.setEnabled(true);
            return;
        }
        if (he2Var instanceof ge2) {
            textView.setVisibility(4);
            progressBar.setVisibility(0);
            button.setEnabled(false);
            return;
        }
        if (!(he2Var instanceof de2)) {
            throw new NoWhenBranchMatchedException();
        }
        ql50 ql50Var = ((de2) he2Var).f47933a;
        View view = vh2Var.f241389a;
        boolean z = ql50Var instanceof ll50;
        if (z) {
            string = ((ll50) ql50Var).f134531a;
            if (string == null) {
                string = view.getContext().getString(R.string.signup_age_error_bad_age);
            }
        } else if (ql50Var instanceof ml50) {
            string = ((ml50) ql50Var).f144758a;
        } else if (wj50.m88271j(ql50Var, nl50.f155007a)) {
            string = view.getContext().getString(R.string.signup_invalid_country);
        } else if (ql50Var instanceof ol50) {
            string = ((ol50) ql50Var).f166762a;
            if (string == null) {
                string = view.getContext().getString(R.string.signup_age_error_invalid_age);
            }
        } else {
            if (!wj50.m88271j(ql50Var, pl50.f178644a)) {
                throw new NoWhenBranchMatchedException();
            }
            string = view.getContext().getString(R.string.signup_error_generic_title);
        }
        textView.setText(string);
        if (!ic2Var.f100711e && !ic2Var.f100712f) {
            textView.setVisibility(0);
            progressBar.setVisibility(8);
            button.setEnabled(false);
        } else if ((ql50Var instanceof ml50) || z || (ql50Var instanceof pl50) || (ql50Var instanceof nl50)) {
            textView.setVisibility(0);
            progressBar.setVisibility(8);
            button.setEnabled(false);
        } else {
            textView.setVisibility(8);
            progressBar.setVisibility(8);
            button.setEnabled(true);
        }
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new th2(this, this.f241395g.subscribe(new C1784dn(consumer, 5)));
    }

    @Override // p204p.InterfaceC2363s5
    /* JADX INFO: renamed from: Z */
    public final void mo28655Z(int i, int i2, int i3) {
        this.f241392d.init(i, i2, i3, new uh2(this));
    }

    @Override // p204p.ndc1
    /* JADX INFO: renamed from: b */
    public final String mo28657b() {
        return this.f241389a.getContext().getString(R.string.signup_title_age);
    }

    @Override // p204p.ndc1
    /* JADX INFO: renamed from: c */
    public final void mo28658c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        ((sfa0) this.f241390b).m78000H(xgg1.m90662N1("SIGNUP_BIRTHDAY", "signup/birthday", 1827, "signup"));
    }

    @Override // p204p.ndc1
    /* JADX INFO: renamed from: a */
    public final void mo28656a() {
    }
}
