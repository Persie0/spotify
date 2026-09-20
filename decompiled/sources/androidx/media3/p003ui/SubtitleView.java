package androidx.media3.p003ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p204p.a0m;
import p204p.b0m;
import p204p.dvb;
import p204p.jx51;
import p204p.mif1;
import p204p.ond1;
import p204p.osb;
import p204p.sf70;

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List f1119a;

    /* JADX INFO: renamed from: b */
    public dvb f1120b;

    /* JADX INFO: renamed from: c */
    public float f1121c;

    /* JADX INFO: renamed from: d */
    public float f1122d;

    /* JADX INFO: renamed from: e */
    public boolean f1123e;

    /* JADX INFO: renamed from: f */
    public boolean f1124f;

    /* JADX INFO: renamed from: g */
    public int f1125g;

    /* JADX INFO: renamed from: h */
    public jx51 f1126h;

    /* JADX INFO: renamed from: i */
    public View f1127i;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<b0m> getCuesWithStylingPreferencesApplied() {
        if (this.f1123e && this.f1124f) {
            return this.f1119a;
        }
        ArrayList arrayList = new ArrayList(this.f1119a.size());
        for (int i = 0; i < this.f1119a.size(); i++) {
            a0m a0mVarM27841a = ((b0m) this.f1119a.get(i)).m27841a();
            if (!this.f1123e) {
                a0mVarM27841a.f11116n = false;
                CharSequence charSequence = a0mVarM27841a.f11103a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a0mVarM27841a.m24370c(SpannableString.valueOf(charSequence));
                    }
                    CharSequence charSequence2 = a0mVarM27841a.f11103a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof sf70)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                mif1.m61854G(a0mVarM27841a);
            } else if (!this.f1124f) {
                mif1.m61854G(a0mVarM27841a);
            }
            arrayList.add(a0mVarM27841a.m24368a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private dvb getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        dvb dvbVar = dvb.f53409g;
        if (zIsInEditMode) {
            return dvbVar;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            dvbVar = new dvb(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return dvbVar;
    }

    private <T extends View & jx51> void setView(T t) {
        removeView(this.f1127i);
        View view = this.f1127i;
        if (view instanceof ond1) {
            ((ond1) view).f167234b.destroy();
        }
        this.f1127i = t;
        this.f1126h = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final void m872a() {
        this.f1126h.mo54496a(getCuesWithStylingPreferencesApplied(), this.f1120b, this.f1121c, this.f1122d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f1124f = z;
        m872a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f1123e = z;
        m872a();
    }

    public void setBottomPaddingFraction(float f) {
        this.f1122d = f;
        m872a();
    }

    public void setCues(List<b0m> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f1119a = list;
        m872a();
    }

    public void setFractionalTextSize(float f) {
        this.f1121c = f;
        m872a();
    }

    public void setStyle(dvb dvbVar) {
        this.f1120b = dvbVar;
        m872a();
    }

    public void setViewType(int i) {
        if (this.f1125g == i) {
            return;
        }
        if (i == 1) {
            setView(new osb(getContext(), 0));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new ond1(getContext()));
        }
        this.f1125g = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1119a = Collections.EMPTY_LIST;
        this.f1120b = dvb.f53409g;
        this.f1121c = 0.0533f;
        this.f1122d = 0.08f;
        this.f1123e = true;
        this.f1124f = true;
        osb osbVar = new osb(context, 0);
        this.f1126h = osbVar;
        this.f1127i = osbVar;
        addView(osbVar);
        this.f1125g = 1;
    }
}
