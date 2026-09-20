package p204p;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.common.util.GlUtil$GlException;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.text.NumberFormat;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class h9p implements nx0 {

    /* JADX INFO: renamed from: a */
    public int f89013a;

    /* JADX INFO: renamed from: b */
    public boolean f89014b;

    /* JADX INFO: renamed from: c */
    public Object f89015c;

    /* JADX INFO: renamed from: d */
    public Object f89016d;

    public /* synthetic */ h9p(Object obj, Object obj2, boolean z, int i) {
        this.f89015c = obj;
        this.f89016d = obj2;
        this.f89014b = z;
        this.f89013a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ gh00 m46873e(h9p h9pVar) {
        return (kz3) h9pVar.f89015c;
    }

    /* JADX INFO: renamed from: g */
    public static h9p m46874g() {
        h9p h9pVar = new h9p();
        h9pVar.f89014b = true;
        h9pVar.f89013a = 0;
        return h9pVar;
    }

    /* JADX INFO: renamed from: n */
    public static String m46875n(long j) {
        try {
            String str = NumberFormat.getInstance().format(j);
            wj50.m88279p(str);
            return str;
        } catch (Exception unused) {
            return String.valueOf(j);
        }
    }

    /* JADX INFO: renamed from: A */
    public gey[] m46876A() {
        return (gey[]) this.f89015c;
    }

    /* JADX INFO: renamed from: B */
    public int m46877B() {
        return this.f89013a;
    }

    @Override // p204p.nx0
    /* JADX INFO: renamed from: a */
    public void mo46878a(int i) {
        if (this.f89014b) {
            if (this.f89013a < 50 && i >= 50) {
                om0 om0Var = (om0) this.f89015c;
                qm0 qm0Var = qm0.VIEWABILITY_50;
                String str = (String) this.f89016d;
                so0 so0Var = str != null ? new so0(str) : null;
                if (so0Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var, qm0Var, so0Var.f211068a, null, null, null, 124);
            }
            if (this.f89013a >= 50 && i < 50) {
                om0 om0Var2 = (om0) this.f89015c;
                qm0 qm0Var2 = qm0.VIEWABILITY_50_LESS;
                String str2 = (String) this.f89016d;
                so0 so0Var2 = str2 != null ? new so0(str2) : null;
                if (so0Var2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var2, qm0Var2, so0Var2.f211068a, null, null, null, 124);
            }
            if (this.f89013a > 0 && i <= 0) {
                om0 om0Var3 = (om0) this.f89015c;
                qm0 qm0Var3 = qm0.VIEWABILITY_0;
                String str3 = (String) this.f89016d;
                so0 so0Var3 = str3 != null ? new so0(str3) : null;
                if (so0Var3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var3, qm0Var3, so0Var3.f211068a, null, null, null, 124);
            }
            if (this.f89013a < 100 && i >= 100) {
                om0 om0Var4 = (om0) this.f89015c;
                qm0 qm0Var4 = qm0.VIEWABILITY_100;
                String str4 = (String) this.f89016d;
                so0 so0Var4 = str4 != null ? new so0(str4) : null;
                if (so0Var4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var4, qm0Var4, so0Var4.f211068a, null, null, null, 124);
            }
        }
        this.f89013a = i;
    }

    @Override // p204p.nx0
    /* JADX INFO: renamed from: b */
    public void mo46879b(String str) {
        throw new IllegalStateException("Video ads do not have a separate asset loading step. Use bindAd() instead.");
    }

    @Override // p204p.nx0
    /* JADX INFO: renamed from: c */
    public void mo46880c(String str, el40 el40Var) {
        this.f89016d = str;
        this.f89013a = -1;
        this.f89014b = true;
    }

    /* JADX INFO: renamed from: f */
    public h9p m46881f() {
        ig31.m50497o("execute parameter required", ((r9w0) this.f89015c) != null);
        gey[] geyVarArr = (gey[]) this.f89016d;
        boolean z = this.f89014b;
        int i = this.f89013a;
        h9p h9pVar = new h9p();
        h9pVar.f89016d = this;
        h9pVar.f89015c = geyVarArr;
        boolean z2 = false;
        if (geyVarArr != null && z) {
            z2 = true;
        }
        h9pVar.f89014b = z2;
        h9pVar.f89013a = i;
        return h9pVar;
    }

    /* JADX INFO: renamed from: h */
    public void m46882h() {
        this.f89013a = 0;
        this.f89014b = true;
    }

    /* JADX INFO: renamed from: i */
    public void m46883i(ud10 ud10Var, int i, int i2) throws GlUtil$GlException {
        int iM62048z;
        int i3;
        int i4;
        ArrayDeque arrayDeque = (ArrayDeque) this.f89015c;
        c95.m31855u(arrayDeque.isEmpty());
        c95.m31855u(((ArrayDeque) this.f89016d).isEmpty());
        for (int i5 = 0; i5 < this.f89013a; i5++) {
            if (this.f89014b) {
                mjx0.m62030h(i, i2);
                iM62048z = mjx0.m62048z();
                mjx0.m62031i(3553, iM62048z, 9729);
                i3 = i;
                i4 = i2;
                GLES20.glTexImage2D(3553, 0, 34842, i3, i4, 0, 6408, 5131, null);
                mjx0.m62033k();
            } else {
                mjx0.m62030h(i, i2);
                iM62048z = mjx0.m62048z();
                mjx0.m62031i(3553, iM62048z, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                mjx0.m62033k();
                i3 = i;
                i4 = i2;
            }
            arrayDeque.add(ud10Var.mo74985i(iM62048z, i3, i4));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m46884j() {
        Iterator itM46889p = m46889p();
        while (true) {
            qw50 qw50Var = (qw50) itM46889p;
            if (!qw50Var.hasNext()) {
                ((ArrayDeque) this.f89015c).clear();
                ((ArrayDeque) this.f89016d).clear();
                return;
            }
            ((ce10) qw50Var.next()).m32471a();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m46885k(o35 o35Var, ev61 ev61Var) {
        ((r9w0) ((h9p) this.f89016d).f89015c).accept(o35Var, ev61Var);
    }

    /* JADX INFO: renamed from: l */
    public void m46886l(ud10 ud10Var, int i, int i2) throws GlUtil$GlException {
        if (!((qw50) m46889p()).hasNext()) {
            m46883i(ud10Var, i, i2);
            return;
        }
        ce10 ce10Var = (ce10) ((qw50) m46889p()).next();
        if (ce10Var.f36992c == i && ce10Var.f36993d == i2) {
            return;
        }
        m46884j();
        m46883i(ud10Var, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public Single m46887m(fmn0 fmn0Var, int i) {
        return ((jw20) this.f89016d).m54399a().take(1L).singleOrError().flatMap(new ob31(i, this, fmn0Var)).onErrorReturn(koq0.f124881V0);
    }

    /* JADX INFO: renamed from: o */
    public int m46888o() {
        return !((qw50) m46889p()).hasNext() ? this.f89013a : ((ArrayDeque) this.f89015c).size();
    }

    /* JADX INFO: renamed from: p */
    public Iterator m46889p() {
        Iterable[] iterableArr = {(ArrayDeque) this.f89015c, (ArrayDeque) this.f89016d};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new knz(iterableArr).iterator();
    }

    /* JADX INFO: renamed from: q */
    public int m46890q() {
        return this.f89013a;
    }

    /* JADX INFO: renamed from: r */
    public void m46891r(zk1 zk1Var, boolean z) {
        MotionEvent motionEvent = (MotionEvent) zk1Var.f283579b;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f89013a = zk1Var.f283580c;
            this.f89014b = false;
        } else if ((action == 1 || action == 2) && z) {
            m46882h();
        }
        ((GestureDetector) this.f89016d).onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public void m46892s(String str, e9p e9pVar) {
        ycc yccVar = (ycc) this.f89016d;
        if ((this.f89014b && this.f89013a == 2) || str == null || str.length() == 0) {
            ((ArtworkView) yccVar.f271454c).setVisibility(8);
            return;
        }
        ArtworkView artworkView = (ArtworkView) yccVar.f271454c;
        artworkView.setVisibility(0);
        artworkView.mo2820d(new u66(new h66(str), true));
        artworkView.setClickable(false);
        artworkView.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: t */
    public void m46893t(r9w0 r9w0Var) {
        this.f89015c = r9w0Var;
    }

    /* JADX INFO: renamed from: u */
    public void m46894u() {
        this.f89014b = false;
    }

    /* JADX INFO: renamed from: v */
    public void m46895v(gey... geyVarArr) {
        this.f89016d = geyVarArr;
    }

    /* JADX INFO: renamed from: w */
    public void m46896w(int i) {
        this.f89013a = i;
    }

    /* JADX INFO: renamed from: x */
    public boolean m46897x() {
        return this.f89014b;
    }

    /* JADX INFO: renamed from: y */
    public boolean m46898y(mhv mhvVar) {
        if (!this.f89014b) {
            return true;
        }
        int iIntValue = ((Number) ((eh00) this.f89015c).invoke()).intValue();
        if (mhvVar.equals(this.f89016d) && iIntValue == this.f89013a) {
            return false;
        }
        this.f89016d = mhvVar;
        this.f89013a = iIntValue;
        return true;
    }

    /* JADX INFO: renamed from: z */
    public ce10 m46899z() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f89015c;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        ce10 ce10Var = (ce10) arrayDeque.remove();
        ((ArrayDeque) this.f89016d).add(ce10Var);
        return ce10Var;
    }

    public h9p(Context context, e940 e940Var, int i) {
        this.f89015c = context;
        this.f89013a = 2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.countdown_row, (ViewGroup) null, false);
        int i2 = R.id.album_artwork;
        ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewInflate, R.id.album_artwork);
        if (artworkView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i2 = R.id.countdown_labels_container;
            View viewM85629k = vie1.m85629k(viewInflate, R.id.countdown_labels_container);
            if (viewM85629k != null) {
                View viewM85629k2 = vie1.m85629k(viewM85629k, R.id.countdown_labels);
                if (viewM85629k2 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k.getResources().getResourceName(R.id.countdown_labels)));
                }
                int i3 = R.id.center_barrier;
                if (((Barrier) vie1.m85629k(viewM85629k2, R.id.center_barrier)) != null) {
                    i3 = R.id.center_guideline;
                    if (((Guideline) vie1.m85629k(viewM85629k2, R.id.center_guideline)) != null) {
                        i3 = R.id.days_label;
                        TextView textView = (TextView) vie1.m85629k(viewM85629k2, R.id.days_label);
                        if (textView != null) {
                            i3 = R.id.days_number;
                            TextView textView2 = (TextView) vie1.m85629k(viewM85629k2, R.id.days_number);
                            if (textView2 != null) {
                                i3 = R.id.divider1;
                                View viewM85629k3 = vie1.m85629k(viewM85629k2, R.id.divider1);
                                if (viewM85629k3 != null) {
                                    i3 = R.id.divider2;
                                    View viewM85629k4 = vie1.m85629k(viewM85629k2, R.id.divider2);
                                    if (viewM85629k4 != null) {
                                        i3 = R.id.divider3;
                                        View viewM85629k5 = vie1.m85629k(viewM85629k2, R.id.divider3);
                                        if (viewM85629k5 != null) {
                                            i3 = R.id.hours_label;
                                            TextView textView3 = (TextView) vie1.m85629k(viewM85629k2, R.id.hours_label);
                                            if (textView3 != null) {
                                                i3 = R.id.hours_number;
                                                TextView textView4 = (TextView) vie1.m85629k(viewM85629k2, R.id.hours_number);
                                                if (textView4 != null) {
                                                    i3 = R.id.minutes_label;
                                                    TextView textView5 = (TextView) vie1.m85629k(viewM85629k2, R.id.minutes_label);
                                                    if (textView5 != null) {
                                                        i3 = R.id.minutes_number;
                                                        TextView textView6 = (TextView) vie1.m85629k(viewM85629k2, R.id.minutes_number);
                                                        if (textView6 != null) {
                                                            i3 = R.id.seconds_label;
                                                            TextView textView7 = (TextView) vie1.m85629k(viewM85629k2, R.id.seconds_label);
                                                            if (textView7 != null) {
                                                                i3 = R.id.seconds_number;
                                                                TextView textView8 = (TextView) vie1.m85629k(viewM85629k2, R.id.seconds_number);
                                                                if (textView8 != null) {
                                                                    t7j t7jVar = new t7j(5, (FrameLayout) viewM85629k, new qyy0((ConstraintLayout) viewM85629k2, textView, textView2, viewM85629k3, viewM85629k4, viewM85629k5, textView3, textView4, textView5, textView6, textView7, textView8, 1));
                                                                    i2 = R.id.countdown_timer;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.countdown_timer);
                                                                    if (constraintLayout != null) {
                                                                        i2 = R.id.premium_early_access_banner_container;
                                                                        FrameLayout frameLayout = (FrameLayout) vie1.m85629k(viewInflate, R.id.premium_early_access_banner_container);
                                                                        if (frameLayout != null) {
                                                                            ycc yccVar = new ycc(linearLayout, artworkView, t7jVar, constraintLayout, frameLayout);
                                                                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                                            layoutParams.setMargins(i, i, i, i);
                                                                            linearLayout.setLayoutParams(layoutParams);
                                                                            float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.spacer_8);
                                                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                                                            gradientDrawable.setColor(context.getColor(R.color.opacity_black_50));
                                                                            gradientDrawable.setCornerRadius(dimensionPixelSize);
                                                                            linearLayout.setBackground(gradientDrawable);
                                                                            linearLayout.setClipToOutline(true);
                                                                            constraintLayout.setMinHeight(linearLayout.getResources().getDimensionPixelSize(R.dimen.countdown_row_height));
                                                                            artworkView.setViewContext(new r96(e940Var));
                                                                            this.f89016d = yccVar;
                                                                            this.f89014b = context.getResources().getConfiguration().fontScale >= 1.6f;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k2.getResources().getResourceName(i3)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public /* synthetic */ h9p(Context context, e940 e940Var) {
        this(context, e940Var, context.getResources().getDimensionPixelSize(R.dimen.spacer_16));
    }

    public h9p(boolean z, int i) {
        this.f89014b = z;
        this.f89013a = i;
        this.f89015c = new ArrayDeque(i);
        this.f89016d = new ArrayDeque(i);
    }

    public h9p(eh00 eh00Var, boolean z) {
        this.f89014b = z;
        this.f89015c = eh00Var;
    }

    public h9p(Parcel parcel) {
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.f89015c = jArr;
        parcel.readLongArray(jArr);
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, RemoteViews.CREATOR);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.f89016d = remoteViewsArr;
        this.f89014b = parcel.readInt() == 1;
        this.f89013a = parcel.readInt();
    }

    public h9p(boolean z, int i, String str, Bundle bundle) {
        this.f89014b = z;
        this.f89013a = i;
        this.f89015c = str;
        this.f89016d = bundle == null ? Bundle.EMPTY : bundle;
    }

    public h9p(Context context, kz3 kz3Var) {
        this.f89015c = kz3Var;
        this.f89013a = 0;
        this.f89016d = new GestureDetector(context, new xo40(this));
    }
}
