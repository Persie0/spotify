package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class dne {

    /* JADX INFO: renamed from: A */
    public String f50765A;

    /* JADX INFO: renamed from: B */
    public Bitmap f50766B;

    /* JADX INFO: renamed from: C */
    public Bitmap f50767C;

    /* JADX INFO: renamed from: a */
    public final Context f50769a;

    /* JADX INFO: renamed from: b */
    public final wme f50770b;

    /* JADX INFO: renamed from: c */
    public final List f50771c;

    /* JADX INFO: renamed from: d */
    public final t2b0 f50772d;

    /* JADX INFO: renamed from: e */
    public final float f50773e;

    /* JADX INFO: renamed from: f */
    public final float f50774f;

    /* JADX INFO: renamed from: g */
    public final float f50775g;

    /* JADX INFO: renamed from: h */
    public final float f50776h;

    /* JADX INFO: renamed from: i */
    public final int f50777i;

    /* JADX INFO: renamed from: j */
    public final int f50778j;

    /* JADX INFO: renamed from: k */
    public final wg61 f50779k = new wg61(new cne(this, 0));

    /* JADX INFO: renamed from: l */
    public final wg61 f50780l = new wg61(new cne(this, 7));

    /* JADX INFO: renamed from: m */
    public final wg61 f50781m = new wg61(new cne(this, 13));

    /* JADX INFO: renamed from: n */
    public final wg61 f50782n = new wg61(new cne(this, 10));

    /* JADX INFO: renamed from: o */
    public final wg61 f50783o = new wg61(new cne(this, 1));

    /* JADX INFO: renamed from: p */
    public final wg61 f50784p = new wg61(new cne(this, 5));

    /* JADX INFO: renamed from: q */
    public final wg61 f50785q = new wg61(new cne(this, 4));

    /* JADX INFO: renamed from: r */
    public final wg61 f50786r = new wg61(new cne(this, 11));

    /* JADX INFO: renamed from: s */
    public final wg61 f50787s = new wg61(new cne(this, 6));

    /* JADX INFO: renamed from: t */
    public final wg61 f50788t = new wg61(y2e.f268589f);

    /* JADX INFO: renamed from: u */
    public final wg61 f50789u = new wg61(new cne(this, 12));

    /* JADX INFO: renamed from: v */
    public final wg61 f50790v = new wg61(new cne(this, 9));

    /* JADX INFO: renamed from: w */
    public final wg61 f50791w = new wg61(new cne(this, 3));

    /* JADX INFO: renamed from: x */
    public final wg61 f50792x = new wg61(new cne(this, 14));

    /* JADX INFO: renamed from: y */
    public final wg61 f50793y = new wg61(new cne(this, 2));

    /* JADX INFO: renamed from: z */
    public final wg61 f50794z = new wg61(new cne(this, 8));

    /* JADX INFO: renamed from: D */
    public boolean f50768D = true;

    public dne(Context context, wme wmeVar, List list, t2b0 t2b0Var) {
        this.f50769a = context;
        this.f50770b = wmeVar;
        this.f50771c = list;
        this.f50772d = t2b0Var;
        float f = 1280 / 390.0f;
        this.f50773e = f;
        this.f50774f = 358.0f * f;
        this.f50775g = 202.0f * f;
        this.f50776h = f * 16.0f;
        this.f50777i = context.getColor(R.color.dark_base_text_subdued);
        this.f50778j = context.getColor(R.color.dark_overmedia_background_base);
    }

    /* JADX INFO: renamed from: a */
    public final void m36467a(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        Drawable drawableMutate;
        Drawable drawable = this.f50769a.getDrawable(i);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return;
        }
        drawableMutate.setTint(-1);
        drawableMutate.setBounds((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        drawableMutate.draw(canvas);
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m36468b() {
        return (Typeface) this.f50779k.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final float m36469c() {
        return ((Number) this.f50792x.getValue()).floatValue();
    }
}
