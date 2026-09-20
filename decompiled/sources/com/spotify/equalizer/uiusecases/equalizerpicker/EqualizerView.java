package com.spotify.equalizer.uiusecases.equalizerpicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a450;
import p204p.aee;
import p204p.b450;
import p204p.bo40;
import p204p.do40;
import p204p.g6f;
import p204p.gh00;
import p204p.gn8;
import p204p.h6f;
import p204p.h6j;
import p204p.i6f;
import p204p.kk6;
import p204p.lau;
import p204p.mec1;
import p204p.oqs;
import p204p.qcw;
import p204p.rx4;
import p204p.t350;
import p204p.vcw;
import p204p.vie1;
import p204p.wcw;
import p204p.wg61;
import p204p.wj50;
import p204p.xcw;
import p204p.zyv;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002:\u0002\u001a\u001bB1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/equalizer/uiusecases/equalizerpicker/EqualizerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lp/oqs;", "", "Lp/qcw;", "Lp/rcw;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lp/gn8;", "R0", "Lp/fr70;", "getBackgroundView", "()Lp/gn8;", "backgroundView", "", "S0", "getShortDuration", "()J", "shortDuration", "p/vcw", "p/wcw", "src_main_java_com_spotify_equalizer_uiusecases-uiusecases"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class EqualizerView extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: W0 */
    public static final /* synthetic */ int f3902W0 = 0;

    /* JADX INFO: renamed from: R0 */
    public final wg61 f3903R0;

    /* JADX INFO: renamed from: S0 */
    public final wg61 f3904S0;

    /* JADX INFO: renamed from: T0 */
    public List f3905T0;

    /* JADX INFO: renamed from: U0 */
    public gh00 f3906U0;

    /* JADX INFO: renamed from: V0 */
    public List f3907V0;

    public EqualizerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    private final gn8 getBackgroundView() {
        return (gn8) this.f3903R0.getValue();
    }

    private final long getShortDuration() {
        return ((Number) this.f3904S0.getValue()).longValue();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f3906U0 = gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e A[EDGE_INSN: B:13:0x002e->B:21:0x005b BREAK  A[LOOP:0: B:15:0x0034->B:108:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(List list) {
        boolean z;
        Object next;
        if (!wj50.m88271j(this.f3905T0, list)) {
            List list2 = this.f3905T0;
            ?? r3 = 0;
            if (list2 == null || list2.size() != list.size()) {
                z = true;
                break;
            }
            Iterable iterableM43744r1 = g6f.m43744r1(list);
            if (!(iterableM43744r1 instanceof Collection) || !((Collection) iterableM43744r1).isEmpty()) {
                Iterator it = iterableM43744r1.iterator();
                while (true) {
                    do40 do40Var = (do40) it;
                    if (!((Iterator) do40Var.f50936c).hasNext()) {
                        z = true;
                        break;
                    }
                    bo40 bo40Var = (bo40) do40Var.next();
                    if (((qcw) bo40Var.f29009b).f187417a == ((qcw) list2.get(bo40Var.f29008a)).f187417a) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                if (list.size() <= 1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                for (vcw vcwVar : this.f3907V0) {
                    ValueAnimator valueAnimator = vcwVar.f240266g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    vcwVar.f240266g = null;
                    removeView(vcwVar.f240260a);
                }
                b450 b450VarM46713J = h6f.m46713J(list);
                int i = b450VarM46713J.f278779b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(b450VarM46713J, 10));
                Iterator it2 = b450VarM46713J.iterator();
                while (((a450) it2).f12141c) {
                    ((t350) it2).nextInt();
                    WeakHashMap weakHashMap = mec1.f142677a;
                    arrayList.add(Integer.valueOf(View.generateViewId()));
                }
                h6j h6jVar = new h6j(0, 0);
                h6jVar.f88145i = 0;
                h6jVar.f88151l = ((Number) g6f.m43741q0(arrayList)).intValue();
                h6jVar.f88164t = 0;
                h6jVar.f88166v = 0;
                getBackgroundView().setLayoutParams(h6jVar);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                ArrayList arrayList2 = new ArrayList();
                if (i >= 0) {
                    int i2 = 0;
                    while (true) {
                        qcw qcwVar = (qcw) list.get(i2);
                        View viewInflate = layoutInflaterFrom.inflate(R.layout.equalizer_seek_bar_layout, this, (boolean) r3);
                        int i3 = R.id.label;
                        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.label);
                        if (textView != null) {
                            i3 = R.id.rotating_layout;
                            RotatingLayout rotatingLayout = (RotatingLayout) vie1.m85629k(viewInflate, R.id.rotating_layout);
                            if (rotatingLayout != null) {
                                i3 = R.id.seek_bar;
                                SeekBar seekBar = (SeekBar) vie1.m85629k(viewInflate, R.id.seek_bar);
                                if (seekBar != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    constraintLayout.setId(((Number) arrayList.get(i2)).intValue());
                                    h6j h6jVar2 = new h6j((int) r3, (int) r3);
                                    h6jVar2.f88145i = r3;
                                    h6jVar2.f88151l = r3;
                                    if (i2 == 0) {
                                        h6jVar2.f88164t = r3;
                                        if (arrayList.size() > 1) {
                                            h6jVar2.f88165u = ((Number) arrayList.get(1)).intValue();
                                        } else {
                                            h6jVar2.f88166v = r3;
                                        }
                                        h6jVar2.f88112J = 1;
                                    } else if (i2 == i) {
                                        h6jVar2.f88163s = ((Number) arrayList.get(i2 - 1)).intValue();
                                        h6jVar2.f88166v = r3;
                                    } else {
                                        h6jVar2.f88163s = ((Number) arrayList.get(i2 - 1)).intValue();
                                        h6jVar2.f88165u = ((Number) arrayList.get(i2 + 1)).intValue();
                                    }
                                    vcw vcwVar2 = new vcw(constraintLayout, qcwVar.f187417a, textView, seekBar, rotatingLayout);
                                    arrayList2.add(vcwVar2);
                                    wcw wcwVar = new wcw(this, vcwVar2);
                                    seekBar.setOnSeekBarChangeListener(wcwVar);
                                    seekBar.setOnTouchListener(wcwVar);
                                    addView(constraintLayout, h6jVar2);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                    r3 = 0;
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                    }
                }
                this.f3907V0 = g6f.m43728j1(arrayList2);
            }
            if (this.f3907V0.size() != list.size()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                qcw qcwVar2 = (qcw) it3.next();
                Iterator it4 = this.f3907V0.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((vcw) next).f240261b != qcwVar2.f187417a);
                vcw vcwVar3 = (vcw) next;
                if (vcwVar3 != null) {
                    SeekBar seekBar2 = vcwVar3.f240263d;
                    int i4 = qcwVar2.f187419c;
                    if (i4 < 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    if (240 < i4) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    seekBar2.setMax(240);
                    vcwVar3.f240262c.setText(qcwVar2.f187418b);
                    ValueAnimator valueAnimator2 = vcwVar3.f240266g;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    vcwVar3.f240266g = null;
                    if (!vcwVar3.f240265f && seekBar2.getProgress() != i4) {
                        if (z) {
                            seekBar2.setProgress(i4);
                        } else {
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(seekBar2.getProgress(), i4);
                            valueAnimatorOfInt.setDuration(getShortDuration());
                            valueAnimatorOfInt.addUpdateListener(new aee(3, vcwVar3, this));
                            arrayList3.add(valueAnimatorOfInt);
                            vcwVar3.f240266g = valueAnimatorOfInt;
                        }
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                addOnLayoutChangeListener(new kk6(this, 12));
            } else {
                ((ValueAnimator) g6f.m43741q0(arrayList3)).addUpdateListener(new rx4(this, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    ((ValueAnimator) it5.next()).start();
                }
            }
        }
        this.f3905T0 = list;
    }

    /* JADX INFO: renamed from: z */
    public final void m9733z(boolean z) {
        gn8 backgroundView = getBackgroundView();
        List<vcw> list = this.f3907V0;
        Rect rect = new Rect();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (vcw vcwVar : list) {
            SeekBar seekBar = vcwVar.f240263d;
            RotatingLayout rotatingLayout = vcwVar.f240264e;
            seekBar.getThumb().copyBounds(rect);
            rect.set(rect.top, rotatingLayout.getBottom() - rect.right, rect.bottom, rotatingLayout.getBottom() - rect.left);
            offsetDescendantRectToMyCoords(rotatingLayout, rect);
            offsetRectIntoDescendantCoords(getBackgroundView(), rect);
            PointF pointF = new PointF(rect.exactCenterX(), rect.exactCenterY());
            pointF.offset(0.0f, (-vcwVar.f240263d.getThumbOffset()) / 2);
            arrayList.add(pointF);
        }
        backgroundView.m45292a(arrayList, z);
    }

    public EqualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public EqualizerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public EqualizerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3903R0 = new wg61(new xcw(0, context, this));
        this.f3904S0 = new wg61(new zyv(this, 8));
        this.f3907V0 = lau.f131415a;
    }

    public /* synthetic */ EqualizerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
