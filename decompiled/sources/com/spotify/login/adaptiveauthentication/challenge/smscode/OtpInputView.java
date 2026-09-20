package com.spotify.login.adaptiveauthentication.challenge.smscode;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.av91;
import p204p.bu91;
import p204p.bv91;
import p204p.cbh0;
import p204p.cz90;
import p204p.dv91;
import p204p.f79;
import p204p.hsg1;
import p204p.kv91;
import p204p.nau;
import p204p.nwl0;
import p204p.owl0;
import p204p.p69;
import p204p.pqk0;
import p204p.prv0;
import p204p.s531;
import p204p.st91;
import p204p.u531;
import p204p.wo5;
import p204p.x09;
import p204p.y28;
import p204p.yt91;
import p204p.z28;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018-.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010'\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&¨\u0006/"}, m24212d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/smscode/OtpInputView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "numDigits", "Lp/w2a1;", "setNumDigits", "(I)V", "", "mismatch", "setOtpMismatch", "(Z)V", "", "code", "setOtp", "(Ljava/lang/String;)V", x09.f256832d, "setEnabled", "Lp/nwl0;", "t", "Lp/nwl0;", "getListener", "()Lp/nwl0;", "setListener", "(Lp/nwl0;)V", "listener", "Lio/reactivex/rxjava3/core/Observable;", "", "getObservable", "()Lio/reactivex/rxjava3/core/Observable;", "observable", "getOtp", "()Ljava/lang/String;", "otp", "getFirstIncompleteDigit", "()I", "firstIncompleteDigit", "getOtpInternal", "otpInternal", "p/wo5", "p/owl0", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OtpInputView extends FrameLayout {

    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ int f5288L0 = 0;

    /* JADX INFO: renamed from: a */
    public TextView[] f5289a;

    /* JADX INFO: renamed from: b */
    public final HiddenOtpEditText f5290b;

    /* JADX INFO: renamed from: c */
    public final HorizontalScrollView f5291c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f5292d;

    /* JADX INFO: renamed from: e */
    public final Rect f5293e;

    /* JADX INFO: renamed from: f */
    public p69 f5294f;

    /* JADX INFO: renamed from: g */
    public final ClipboardManager f5295g;

    /* JADX INFO: renamed from: h */
    public int f5296h;

    /* JADX INFO: renamed from: i */
    public int f5297i;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public nwl0 listener;

    public OtpInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final int getFirstIncompleteDigit() {
        TextView textView;
        int i = this.f5296h;
        for (int i2 = 0; i2 < i; i2++) {
            TextView[] textViewArr = this.f5289a;
            if (!Pattern.compile("\\d").matcher(String.valueOf((textViewArr == null || (textView = textViewArr[i2]) == null) ? null : textView.getText())).matches()) {
                return i2;
            }
        }
        return -1;
    }

    private final String getOtpInternal() {
        StringBuilder sb = new StringBuilder();
        int i = this.f5296h;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(m13282c(i2));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m13280a(int i) {
        Rect rect;
        TextView textView;
        TextView[] textViewArr;
        TextView textView2;
        TextView[] textViewArr2;
        TextView textView3;
        nwl0 nwl0Var;
        if (i >= 0 && (nwl0Var = this.listener) != null) {
            s531 s531Var = (s531) ((prv0) nwl0Var).f180688b;
            s531Var.m77218j1(false);
            u531 u531VarM77217i1 = s531Var.m77217i1();
            if (!u531VarM77217i1.f226897k) {
                u531VarM77217i1.f226897k = true;
                kv91 kv91Var = u531VarM77217i1.f226889c;
                cbh0 cbh0Var = u531VarM77217i1.f226896j;
                cbh0Var.getClass();
                yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("otp_field", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57452p(new av91("", "", new dv91("hit", 1), new bv91("focus_input_field", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
            }
        }
        int i2 = this.f5297i;
        HiddenOtpEditText hiddenOtpEditText = this.f5290b;
        if (i == i2) {
            if (i < 0 || !isEnabled()) {
                return;
            }
            hsg1.m48458z(hiddenOtpEditText);
            return;
        }
        if (i2 >= 0 && (textViewArr2 = this.f5289a) != null && (textView3 = textViewArr2[i2]) != null) {
            textView3.setActivated(false);
        }
        if (i >= 0 && (textViewArr = this.f5289a) != null && (textView2 = textViewArr[i]) != null) {
            textView2.setActivated(true);
        }
        this.f5297i = i;
        if (i < 0) {
            hsg1.m48453t(hiddenOtpEditText);
            return;
        }
        hsg1.m48458z(hiddenOtpEditText);
        TextView[] textViewArr3 = this.f5289a;
        if (textViewArr3 == null || (textView = textViewArr3[i]) == null) {
            rect = null;
        } else {
            int left = textView.getLeft();
            int top = textView.getTop();
            int right = textView.getRight();
            int bottom = textView.getBottom();
            rect = this.f5293e;
            rect.set(left, top, right, bottom);
        }
        this.f5291c.requestChildRectangleOnScreen(this.f5292d, rect, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m13281b() {
        int firstIncompleteDigit;
        if (isEnabled() && (firstIncompleteDigit = getFirstIncompleteDigit()) >= 0) {
            m13280a(firstIncompleteDigit);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m13282c(int i) {
        TextView textView;
        TextView[] textViewArr = this.f5289a;
        return String.valueOf((textViewArr == null || (textView = textViewArr[i]) == null) ? null : textView.getText());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13283d() {
        return this.f5296h > 0 && getFirstIncompleteDigit() < 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m13284e(String str) {
        String strM13288i = m13288i(str);
        if (strM13288i != null) {
            m13280a(this.f5296h - 1);
            int i = this.f5296h;
            int i2 = 0;
            while (i2 < i) {
                m13287h(i2, i2 < strM13288i.length() ? String.valueOf(strM13288i.charAt(i2)) : " ");
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13285f(Bundle bundle) {
        if (bundle.containsKey("key-otp")) {
            int i = bundle.getInt("num-digits");
            String[] stringArray = bundle.getStringArray("key-otp");
            setNumDigits(i);
            for (int i2 = 0; i2 < i; i2++) {
                m13287h(i2, stringArray != null ? stringArray[i2] : null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13286g(Bundle bundle) {
        int i = this.f5296h;
        if (i <= 0) {
            return;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = m13282c(i2);
        }
        bundle.putStringArray("key-otp", strArr);
        bundle.putInt("num-digits", this.f5296h);
    }

    public final nwl0 getListener() {
        return this.listener;
    }

    public final Observable<CharSequence> getObservable() {
        Observable<CharSequence> observableHide;
        if (this.f5294f == null) {
            this.f5294f = new p69();
        }
        p69 p69Var = this.f5294f;
        return (p69Var == null || (observableHide = p69Var.hide()) == null) ? Observable.empty() : observableHide;
    }

    public final String getOtp() {
        if (m13283d()) {
            return getOtpInternal();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m13287h(int i, String str) {
        int i2;
        TextView textView;
        boolean zM13283d = m13283d();
        TextView[] textViewArr = this.f5289a;
        if (textViewArr != null && (textView = textViewArr[i]) != null) {
            textView.setText(str);
        }
        if (zM13283d != m13283d()) {
            nwl0 nwl0Var = this.listener;
            if (nwl0Var != null) {
                ((Button) ((s531) ((prv0) nwl0Var).f180688b).m77216h1().f121373i).setEnabled(!zM13283d);
            }
            if (!zM13283d && (i2 = this.f5297i) >= 0 && i2 == this.f5296h - 1) {
                nwl0 nwl0Var2 = this.listener;
                if (nwl0Var2 != null) {
                    Button button = (Button) ((s531) ((prv0) nwl0Var2).f180688b).m77216h1().f121373i;
                    if (button.isEnabled() && button.isClickable()) {
                        button.performClick();
                    }
                }
                m13280a(-1);
            }
        }
        p69 p69Var = this.f5294f;
        if (p69Var != null) {
            p69Var.accept(getOtpInternal());
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m13288i(String str) {
        if (str.length() == this.f5296h) {
            int length = str.length();
            boolean zMatches = true;
            for (int i = 0; i < length; i++) {
                zMatches &= Pattern.compile("\\d").matcher(String.valueOf(str.charAt(i))).matches();
            }
            if (zMatches) {
                return str;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.f5290b.setEnabled(enabled);
        TextView[] textViewArr = this.f5289a;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                if (textView != null) {
                    textView.setEnabled(enabled);
                }
            }
        }
        if (enabled) {
            m13281b();
        } else {
            m13280a(-1);
        }
    }

    public final void setListener(nwl0 nwl0Var) {
        this.listener = nwl0Var;
    }

    public final void setNumDigits(int numDigits) {
        if (this.f5296h == numDigits) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = this.f5296h;
        for (int i2 = 0; i2 < i; i2++) {
            m13287h(i2, " ");
        }
        m13280a(-1);
        ViewGroup viewGroup = this.f5292d;
        viewGroup.removeAllViews();
        this.f5289a = new TextView[numDigits];
        owl0 owl0Var = new owl0(this);
        for (int i3 = 0; i3 < numDigits; i3++) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.otp_input_field, viewGroup, false);
            textView.setActivated(false);
            textView.setText(" ");
            textView.setOnClickListener(new f79(this, i3, 3));
            textView.setTextIsSelectable(true);
            textView.setCursorVisible(false);
            textView.setCustomSelectionActionModeCallback(owl0Var);
            viewGroup.addView(textView);
            TextView[] textViewArr = this.f5289a;
            if (textViewArr != null) {
                textViewArr[i3] = textView;
            }
        }
        this.f5296h = numDigits;
    }

    public final void setOtp(String code) {
        int length = code.length();
        int i = 0;
        int i2 = 0;
        while (i < code.length()) {
            int i3 = i2 + 1;
            m13287h(i2, i2 < length ? String.valueOf(code.charAt(i)) : " ");
            i++;
            i2 = i3;
        }
    }

    public final void setOtpMismatch(boolean mismatch) {
        int i = mismatch ? R.drawable.bg_otp_input_field_mismatch : R.drawable.bg_otp_input_field;
        int i2 = mismatch ? R.color.red : R.color.white;
        TextView[] textViewArr = this.f5289a;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                if (textView != null) {
                    textView.setTextColor(getContext().getColor(i2));
                }
                if (textView != null) {
                    textView.setBackgroundResource(i);
                }
            }
        }
    }

    public OtpInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OtpInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        wo5 wo5Var = new wo5(this, 10);
        this.f5293e = new Rect();
        this.f5295g = (ClipboardManager) context.getSystemService("clipboard");
        this.f5297i = -1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        HiddenOtpEditText hiddenOtpEditText = (HiddenOtpEditText) layoutInflaterFrom.inflate(R.layout.sms_code_input_hidden, (ViewGroup) this, false);
        this.f5290b = hiddenOtpEditText;
        hiddenOtpEditText.setOnFocusChangeListener(new y28(this, 10));
        hiddenOtpEditText.addTextChangedListener(wo5Var);
        hiddenOtpEditText.setOnInputActionListener(new cz90(this, 29));
        hiddenOtpEditText.setOnEditorActionListener(new z28(new pqk0(this, 4), 2));
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) layoutInflaterFrom.inflate(R.layout.otp_input_container, (ViewGroup) this, false);
        this.f5291c = horizontalScrollView;
        this.f5292d = (ViewGroup) horizontalScrollView.findViewById(R.id.input_container);
        addView(hiddenOtpEditText);
        addView(horizontalScrollView);
    }

    public /* synthetic */ OtpInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
