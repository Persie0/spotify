package p204p;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uqw0 implements rr91 {

    /* JADX INFO: renamed from: a */
    public final mqw0 f233139a;

    /* JADX INFO: renamed from: b */
    public final Consumer f233140b;

    /* JADX INFO: renamed from: c */
    public final q831 f233141c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f233142d;

    /* JADX INFO: renamed from: e */
    public final xir f233143e;

    public uqw0(mqw0 mqw0Var, Consumer consumer, q831 q831Var) {
        EncoreTextView encoreTextView = (EncoreTextView) mqw0Var.f146369c;
        this.f233139a = mqw0Var;
        this.f233140b = consumer;
        this.f233141c = q831Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) mqw0Var.f146367a;
        this.f233142d = constraintLayout;
        this.f233143e = xir.m91157c(xir.m91158d(new bkb0(pqw0.f180440h, 2), xir.m91155a(new p0p0(this, 24))), xir.m91158d(new bkb0(qqw0.f191670h, 2), xir.m91155a(new gjs0(this, 16))), xir.m91158d(new bkb0(rqw0.f201901h, 2), xir.m91155a(new n9r0(this, 24))), xir.m91158d(new bkb0(sqw0.f213181h, 2), xir.m91155a(new fus0(this, 12))), xir.m91158d(new bkb0(tqw0.f222901h, 2), xir.m91155a(new rwt0(this, 10))), xir.m91158d(new bkb0(oqw0.f168396h, 2), xir.m91155a(new djs0(this, 15))));
        EncoreButton encoreButton = (EncoreButton) mqw0Var.f146366X;
        encoreButton.setEnabled(false);
        ((RadioGroup) mqw0Var.f146376t).setOnCheckedChangeListener(new nqw0(this));
        encoreButton.setOnClickListener(new hta0(this, 21));
        ((EditText) mqw0Var.f146371e).addTextChangedListener(new wo5(this, 11));
        q831Var.m72299b(new w3f(this, 2));
        if (Build.VERSION.SDK_INT >= 28) {
            constraintLayout.setAccessibilityPaneTitle(constraintLayout.getContext().getString(R.string.report_a_problem_accessibility_title));
        }
        String string = constraintLayout.getContext().getString(R.string.report_concern);
        String string2 = constraintLayout.getContext().getString(R.string.report_concern_link);
        int iM88458H0 = wl51.m88458H0(string, string2, 0, false, 6);
        int length = string2.length() + iM88458H0;
        xih xihVar = new xih(this, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(xihVar, iM88458H0, length, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(constraintLayout.getContext().getColor(R.color.report_problem_text_color)), 0, spannableStringBuilder.length(), 33);
        encoreTextView.setText(spannableStringBuilder);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p204p.rr91
    /* JADX INFO: renamed from: a */
    public final View mo25081a() {
        return this.f233142d;
    }
}
