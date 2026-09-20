package p204p;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class o1q extends LinearLayout implements ovf {

    /* JADX INFO: renamed from: i */
    public static final int f160822i = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: a */
    public b8s0 f160823a;

    /* JADX INFO: renamed from: b */
    public final wg61 f160824b;

    /* JADX INFO: renamed from: c */
    public final wg61 f160825c;

    /* JADX INFO: renamed from: d */
    public final wg61 f160826d;

    /* JADX INFO: renamed from: e */
    public final wg61 f160827e;

    /* JADX INFO: renamed from: f */
    public final wg61 f160828f;

    /* JADX INFO: renamed from: g */
    public final wg61 f160829g;

    /* JADX INFO: renamed from: h */
    public final wg61 f160830h;

    public o1q(Context context) {
        super(context, null, 0);
        this.f160824b = new wg61(new n1q(this, 4));
        this.f160825c = new wg61(new n1q(this, 3));
        this.f160826d = new wg61(new n1q(this, 1));
        this.f160827e = new wg61(new n1q(this, 0));
        this.f160828f = new wg61(new n1q(this, 2));
        this.f160829g = new wg61(new C2652zj(context, 15));
        this.f160830h = new wg61(new C2652zj(context, 16));
        View.inflate(context, R.layout.progres_status_library_layout, this);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView playedText = getPlayedText();
        playedText.setMaxLines(1);
        playedText.setSingleLine(true);
        playedText.setEllipsize(TextUtils.TruncateAt.END);
    }

    private final View getCheckPlayIcon() {
        return (View) this.f160827e.getValue();
    }

    private final View getPlayProgress() {
        return (View) this.f160826d.getValue();
    }

    private final int getPlayProgressDefaultWidth() {
        return ((Number) this.f160829g.getValue()).intValue();
    }

    private final int getPlayProgressMargin() {
        return ((Number) this.f160830h.getValue()).intValue();
    }

    private final TextView getPlayedText() {
        return (TextView) this.f160828f.getValue();
    }

    private final PlayProgressBarView getProgressBar() {
        return (PlayProgressBarView) this.f160825c.getValue();
    }

    private final TextView getProgressText() {
        return (TextView) this.f160824b.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m66077a(w7s0 w7s0Var) {
        z7s0 z7s0Var = w7s0Var.f248778a;
        if (z7s0Var == null || z7s0Var.f280275a.length() == 0) {
            getProgressBar().mo2820d(new mqo0(true, false, 0.0f, 2, null, true, 22));
        } else {
            m66078b(z7s0Var, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66078b(z7s0 z7s0Var, boolean z) {
        TextView progressText = getProgressText();
        String str = z7s0Var.f280275a;
        int i = z7s0Var.f280276b;
        progressText.setText(str.length() == 0 ? getView().getContext().getString(R.string.f6037x3cea39da, Integer.valueOf(i)) : getView().getContext().getString(R.string.f6038xd6dfaaff, z7s0Var.f280275a, Integer.valueOf(i)));
        getProgressBar().mo2820d(new mqo0(true, false, z7s0Var.f280277c, 3, null, z, 18));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        z7s0 z7s0Var;
        b8s0 b8s0Var = (b8s0) obj;
        this.f160823a = b8s0Var;
        a8s0 a8s0Var = b8s0Var.f24654a;
        boolean z = a8s0Var instanceof w7s0;
        int i = 0;
        if (z) {
            m66077a((w7s0) a8s0Var);
        } else if (a8s0Var instanceof x7s0) {
            m66078b(((x7s0) a8s0Var).f258986a, false);
        } else if (!(a8s0Var instanceof y7s0)) {
            throw new NoWhenBranchMatchedException();
        }
        getView().setVisibility(!(a8s0Var instanceof y7s0) ? 0 : 8);
        TextView progressText = getProgressText();
        if (!(a8s0Var instanceof x7s0) && (!z || (z7s0Var = ((w7s0) a8s0Var).f248778a) == null || z7s0Var.f280275a.length() <= 0)) {
            i = 8;
        }
        progressText.setVisibility(i);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x018f  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a2  */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a8s0 a8s0Var;
        z7s0 z7s0Var;
        int measuredWidth;
        int playProgressDefaultWidth;
        View playProgress;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        b8s0 b8s0Var = this.f160823a;
        if (b8s0Var == null || (a8s0Var = b8s0Var.f24654a) == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        boolean z2 = a8s0Var instanceof x7s0;
        int i3 = f160822i;
        if (z2) {
            z7s0 z7s0Var2 = ((x7s0) a8s0Var).f258986a;
            if (z7s0Var2.f280275a.length() > 0) {
                m66078b(z7s0Var2, false);
                measureChild(getProgressText(), i3, i3);
                measureChild(getProgressBar(), i3, i3);
                if (getProgressText().getMeasuredWidth() + getProgressBar().getMeasuredWidth() > size) {
                    getProgressText().setText(getView().getContext().getString(R.string.f6037x3cea39da, Integer.valueOf(z7s0Var2.f280276b)));
                    measureChild(getProgressText(), i3, i3);
                    int measuredWidth2 = size - getProgressText().getMeasuredWidth();
                    int playProgressDefaultWidth2 = getPlayProgressDefaultWidth();
                    if (measuredWidth2 > playProgressDefaultWidth2) {
                        measuredWidth2 = playProgressDefaultWidth2;
                    }
                    View playProgress2 = getPlayProgress();
                    ViewGroup.LayoutParams layoutParams2 = playProgress2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    h6j h6jVar = (h6j) layoutParams2;
                    ((ViewGroup.MarginLayoutParams) h6jVar).width = measuredWidth2;
                    playProgress2.setLayoutParams(h6jVar);
                    measureChild(getProgressBar(), View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), i3);
                }
            } else if (a8s0Var instanceof w7s0) {
                w7s0 w7s0Var = (w7s0) a8s0Var;
                z7s0Var = w7s0Var.f248778a;
                m66077a(w7s0Var);
                measureChild(getPlayedText(), i3, i3);
                measureChild(getCheckPlayIcon(), i3, i3);
                measureChild(getProgressBar(), i3, i3);
                if (z7s0Var == null) {
                    View checkPlayIcon = getCheckPlayIcon();
                    if (getCheckPlayIcon().getMeasuredWidth() + getPlayedText().getMeasuredWidth() < size) {
                        z = true;
                    } else {
                        z = false;
                    }
                    checkPlayIcon.setVisibility(z ? 0 : 8);
                    measureChild(getProgressBar(), i3, i3);
                } else if (z7s0Var.f280275a.length() > 0) {
                    measureChild(getProgressText(), i3, i3);
                    getCheckPlayIcon().setVisibility(0);
                    measureChild(getCheckPlayIcon(), i3, i3);
                    measureChild(getProgressBar(), i3, i3);
                    if (getCheckPlayIcon().getMeasuredWidth() + getProgressText().getMeasuredWidth() + getProgressText().getMeasuredWidth() > size) {
                        getProgressText().setText(getView().getContext().getString(R.string.f6037x3cea39da, Integer.valueOf(z7s0Var.f280276b)));
                        measureChild(getProgressText(), i3, i3);
                        measureChild(getProgressBar(), i3, i3);
                        measuredWidth = (size - getProgressText().getMeasuredWidth()) - (getCheckPlayIcon().getMeasuredWidth() + getPlayProgressMargin());
                        playProgressDefaultWidth = getPlayProgressDefaultWidth();
                        if (measuredWidth > playProgressDefaultWidth) {
                            measuredWidth = playProgressDefaultWidth;
                        }
                        playProgress = getPlayProgress();
                        layoutParams = playProgress.getLayoutParams();
                        if (layoutParams != null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        h6j h6jVar2 = (h6j) layoutParams;
                        ((ViewGroup.MarginLayoutParams) h6jVar2).width = measuredWidth;
                        playProgress.setLayoutParams(h6jVar2);
                        measureChild(getProgressBar(), View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), i3);
                    }
                }
            }
        } else if (a8s0Var instanceof w7s0) {
            w7s0 w7s0Var2 = (w7s0) a8s0Var;
            z7s0Var = w7s0Var2.f248778a;
            m66077a(w7s0Var2);
            measureChild(getPlayedText(), i3, i3);
            measureChild(getCheckPlayIcon(), i3, i3);
            measureChild(getProgressBar(), i3, i3);
            if (z7s0Var == null) {
                View checkPlayIcon2 = getCheckPlayIcon();
                if (getCheckPlayIcon().getMeasuredWidth() + getPlayedText().getMeasuredWidth() < size) {
                    z = true;
                } else {
                    z = false;
                }
                checkPlayIcon2.setVisibility(z ? 0 : 8);
                measureChild(getProgressBar(), i3, i3);
            } else if (z7s0Var.f280275a.length() > 0) {
                measureChild(getProgressText(), i3, i3);
                getCheckPlayIcon().setVisibility(0);
                measureChild(getCheckPlayIcon(), i3, i3);
                measureChild(getProgressBar(), i3, i3);
                if (getCheckPlayIcon().getMeasuredWidth() + getProgressText().getMeasuredWidth() + getProgressText().getMeasuredWidth() > size) {
                    getProgressText().setText(getView().getContext().getString(R.string.f6037x3cea39da, Integer.valueOf(z7s0Var.f280276b)));
                    measureChild(getProgressText(), i3, i3);
                    measureChild(getProgressBar(), i3, i3);
                    measuredWidth = (size - getProgressText().getMeasuredWidth()) - (getCheckPlayIcon().getMeasuredWidth() + getPlayProgressMargin());
                    playProgressDefaultWidth = getPlayProgressDefaultWidth();
                    if (measuredWidth > playProgressDefaultWidth) {
                        measuredWidth = playProgressDefaultWidth;
                    }
                    playProgress = getPlayProgress();
                    layoutParams = playProgress.getLayoutParams();
                    if (layoutParams != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    h6j h6jVar3 = (h6j) layoutParams;
                    ((ViewGroup.MarginLayoutParams) h6jVar3).width = measuredWidth;
                    playProgress.setLayoutParams(h6jVar3);
                    measureChild(getProgressBar(), View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), i3);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // p204p.clc1
    public View getView() {
        return this;
    }
}
