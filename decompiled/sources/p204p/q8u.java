package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p204p.dk5;
import p204p.ojv0;
import p204p.wj50;

/* JADX INFO: loaded from: classes3.dex */
public final class q8u extends FrameLayout {

    /* JADX INFO: renamed from: M0 */
    public static boolean f186388M0;

    /* JADX INFO: renamed from: L0 */
    public y8j f186389L0;

    /* JADX INFO: renamed from: a */
    public Float f186390a;

    /* JADX INFO: renamed from: b */
    public int f186391b;

    /* JADX INFO: renamed from: c */
    public final sr31 f186392c;

    /* JADX INFO: renamed from: d */
    public final c9k f186393d;

    /* JADX INFO: renamed from: e */
    public tzu0 f186394e;

    /* JADX INFO: renamed from: f */
    public boolean f186395f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f186396g;

    /* JADX INFO: renamed from: h */
    public as50 f186397h;

    /* JADX INFO: renamed from: i */
    public dk5 f186398i;

    /* JADX INFO: renamed from: t */
    public b8u f186399t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    public q8u(Context context) {
        super(context, null, 0);
        fbk fbkVar = null;
        this.f186391b = 9;
        this.f186392c = new sr31(context);
        c9k c9kVarM56661c = kk40.m56661c(dau.f47107a);
        this.f186393d = c9kVarM56661c;
        this.f186394e = new hcn(context, 27);
        this.f186395f = true;
        this.f186396g = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, e3u0.f55888a, 0, 0);
        this.f186390a = typedArrayObtainStyledAttributes.hasValue(1) ? Float.valueOf(typedArrayObtainStyledAttributes.getFloat(1, 0.0f)) : null;
        setEmojiGridColumns(typedArrayObtainStyledAttributes.getInt(0, 9));
        typedArrayObtainStyledAttributes.recycle();
        int i = 2;
        if (p7u.m69298d()) {
            int iM69300c = p7u.m69297a().m69300c();
            if (iM69300c == 0) {
                p7u.m69297a().m69305i(new flp(i, this, context));
            } else if (iM69300c == 1) {
                f186388M0 = true;
            } else if (iM69300c == 3) {
                p7u.m69297a().m69305i(new flp(i, this, context));
            }
        }
        n5q n5qVar = xsr.f265651a;
        x0h1.m89578u(c9kVarM56661c, tlp.f221498c, 0, new m5u(this, context, fbkVar, i), 2);
    }

    /* JADX INFO: renamed from: a */
    public final dk5 m72340a() {
        ro80 ro80VarM44508o = geg1.m44508o();
        as50 as50Var = new as50(R.drawable.quantum_gm_ic_access_time_filled_vd_theme_24, new ahc(getContext().getString(R.string.emoji_category_recent)), this.f186396g, Integer.valueOf(this.f186391b * 3), new g7o0(getContext().getString(R.string.emoji_empty_recent_category)));
        this.f186397h = as50Var;
        ro80VarM44508o.add(as50Var);
        List<yra> list = u4g1.f226700Z;
        if (list == null) {
            throw new IllegalStateException("BundledEmojiListLoader.load is not called or complete");
        }
        int i = 0;
        for (yra yraVar : list) {
            int i2 = i + 1;
            int i3 = yraVar.f275430a;
            ahc ahcVar = new ahc(yraVar.f275431b);
            List list2 = yraVar.f275432c;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                String str = ((e9u) obj).f57534a;
                String str2 = (String) ((Map) ((wg61) this.f186392c.f213225c).getValue()).get(str);
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(new b9u(str, i4 + i, 2));
                i4 = i5;
            }
            ro80VarM44508o.add(new as50(i3, ahcVar, arrayList, null, null));
            i = i2;
        }
        return new dk5(geg1.m44506m(ro80VarM44508o));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new UnsupportedOperationException("Adding views to the EmojiPickerView is unsupported");
        }
        super.addView(view);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m72341b(ibk ibkVar) {
        m8u m8uVar;
        int iM27063b;
        if (ibkVar instanceof m8u) {
            m8uVar = (m8u) ibkVar;
            int i = m8uVar.f141130d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m8uVar.f141130d = i - Integer.MIN_VALUE;
            } else {
                m8uVar = new m8u(this, ibkVar);
            }
        } else {
            m8uVar = new m8u(this, ibkVar);
        }
        Object objMo47130b = m8uVar.f141128b;
        int i2 = m8uVar.f141130d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo47130b);
            if (this.f186395f) {
                as50 as50Var = this.f186397h;
                iM27063b = as50Var != null ? as50Var.m27063b() : 0;
                tzu0 tzu0Var = this.f186394e;
                m8uVar.f141127a = iM27063b;
                m8uVar.f141130d = 1;
                objMo47130b = tzu0Var.mo47130b(m8uVar);
                if (objMo47130b != yukVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo47130b);
            return w2a1Var;
        }
        iM27063b = m8uVar.f141127a;
        bga.m29073P(objMo47130b);
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a;
        lzr lzrVar = new lzr(this, (List) objMo47130b, iM27063b, (fbk) null);
        m8uVar.f141130d = 2;
        return x0h1.m89557A(rb20Var, lzrVar, m8uVar) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m72342c() {
        this.f186398i = m72340a();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f186391b, 0);
        gridLayoutManager.f1161k1 = new p8u(this, 0);
        Context context = getContext();
        dk5 dk5Var = this.f186398i;
        if (dk5Var == null) {
            wj50.m88260d0("emojiPickerItems");
            throw null;
        }
        d8u d8uVar = new d8u(context, dk5Var, new C1926h6(16, this, gridLayoutManager));
        super.removeAllViews();
        View viewInflate = View.inflate(getContext(), R.layout.emoji_picker, this);
        RecyclerView recyclerView = (RecyclerView) mec1.m61562n(viewInflate, R.id.emoji_picker_header);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: androidx.emoji2.emojipicker.EmojiPickerView$showEmojiPickerView$1$1$1
            {
                super(0);
            }

            @Override // androidx.recyclerview.widget.AbstractC0110a
            /* JADX INFO: renamed from: s */
            public final boolean mo593s(ojv0 ojv0Var) {
                int paddingStart = (this.f1288M0 - getPaddingStart()) - getPaddingEnd();
                dk5 dk5Var2 = this.f879e1.f186398i;
                if (dk5Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) ojv0Var).width = paddingStart / ((List) dk5Var2.f49881b).size();
                    return true;
                }
                wj50.m88260d0("emojiPickerItems");
                throw null;
            }
        });
        recyclerView.setAdapter(d8uVar);
        RecyclerView recyclerView2 = (RecyclerView) mec1.m61562n(viewInflate, R.id.emoji_picker_body);
        recyclerView2.setLayoutManager(gridLayoutManager);
        b8u b8uVar = new b8u(getContext(), this.f186391b, this.f186390a, this.f186392c, new mo4(this, 21), new nk4(this, 4));
        b8uVar.m47720w(true);
        this.f186399t = b8uVar;
        recyclerView2.setAdapter(b8uVar);
        recyclerView2.m1018m(new o8u(d8uVar, this, gridLayoutManager));
        recyclerView2.setItemAnimator(null);
        ujv0 ujv0Var = new ujv0();
        ujv0Var.m83294b(2, 100);
        recyclerView2.setRecycledViewPool(ujv0Var);
    }

    public final int getEmojiGridColumns() {
        return this.f186391b;
    }

    public final float getEmojiGridRows() {
        Float f = this.f186390a;
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    public final void setEmojiGridColumns(int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        this.f186391b = numValueOf != null ? numValueOf.intValue() : 9;
        if (isLaidOut()) {
            m72342c();
        }
    }

    public final void setEmojiGridRows(float f) {
        Float fValueOf = Float.valueOf(f);
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        this.f186390a = fValueOf;
        if (isLaidOut()) {
            m72342c();
        }
    }

    public final void setOnEmojiPickedListener(y8j y8jVar) {
        this.f186389L0 = y8jVar;
    }

    public final void setRecentEmojiProvider(tzu0 tzu0Var) {
        this.f186394e = tzu0Var;
        x0h1.m89578u(this.f186393d, null, 0, new n8u(this, null, 0), 3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Adding views to the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new UnsupportedOperationException("Adding views to the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Adding views to the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i, i2);
            return;
        }
        throw new UnsupportedOperationException("Adding views to the EmojiPickerView is unsupported");
    }
}
