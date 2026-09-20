package p204p;

import android.graphics.Canvas;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class kiq implements iw41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123038a;

    /* JADX INFO: renamed from: b */
    public float f123039b;

    /* JADX INFO: renamed from: c */
    public float f123040c;

    /* JADX INFO: renamed from: d */
    public final Object f123041d;

    public kiq(cl8 cl8Var) {
        this.f123038a = 0;
        this.f123041d = cl8Var;
        this.f123039b = 16;
        this.f123040c = 8;
    }

    /* JADX INFO: renamed from: g */
    public static kiq m56517g(float f) {
        return m56518h(0.0f, f) ? new kiq(0.0f, 0.0f, new mj50(0.0f)) : new kiq(0.0f, f, new vi5(f, 5));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m56518h(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-6d;
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: a */
    public void mo48915a(float f) {
        this.f123039b = f;
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.f123041d;
        WeakHashMap weakHashMap = mec1.f142677a;
        stateListAnimatorButton.postInvalidateOnAnimation();
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: b */
    public void mo48916b(Canvas canvas) {
        canvas.save();
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.f123041d;
        canvas.translate(stateListAnimatorButton.getWidth() / 2.0f, stateListAnimatorButton.getHeight() / 2.0f);
        canvas.scale(this.f123039b, this.f123040c);
        canvas.translate((-stateListAnimatorButton.getWidth()) / 2.0f, (-stateListAnimatorButton.getHeight()) / 2.0f);
        super/*android.view.View*/.onDraw(canvas);
        canvas.restore();
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: c */
    public float mo48917c() {
        return this.f123039b;
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: d */
    public void mo48918d(float f) {
        this.f123040c = f;
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.f123041d;
        WeakHashMap weakHashMap = mec1.f142677a;
        stateListAnimatorButton.postInvalidateOnAnimation();
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: e */
    public float mo48919e() {
        return this.f123040c;
    }

    /* JADX INFO: renamed from: f */
    public kiq m56519f() {
        float f = this.f123039b;
        float f2 = this.f123040c;
        return m56518h(f, f2) ? this : new kiq(f, f2, new xyx(this, new kiq(f, f2, new skp(this, 18))));
    }

    /* JADX INFO: renamed from: i */
    public float m56520i() {
        return this.f123040c;
    }

    /* JADX INFO: renamed from: j */
    public float m56521j() {
        return this.f123039b;
    }

    /* JADX INFO: renamed from: k */
    public kiq m56522k(float f) {
        float f2 = this.f123039b;
        float f3 = this.f123040c;
        if (m56518h(f2, f3)) {
            throw new IllegalArgumentException("Can't remap from an empty domain");
        }
        return m56518h(f, 0.0f) ? new kiq(f, f, new mj50(f)) : new kiq(f, 0.0f, new xyx(this, new kiq(f, 0.0f, new nj50(f2, f3, f))));
    }

    /* JADX INFO: renamed from: l */
    public float m56523l(float f) {
        float f2 = this.f123039b;
        float f3 = this.f123040c;
        return m56518h(f2, f3) ? f2 : ((oj50) this.f123041d).mo61924h(f2, f3, f);
    }

    public String toString() {
        switch (this.f123038a) {
            case 1:
                return String.format(Locale.US, "IntervalTransformer: %s", (oj50) this.f123041d);
            default:
                return super.toString();
        }
    }

    public kiq(StateListAnimatorButton stateListAnimatorButton) {
        this.f123038a = 2;
        this.f123041d = stateListAnimatorButton;
        this.f123039b = 1.0f;
        this.f123040c = 1.0f;
    }

    public kiq(float f, float f2, oj50 oj50Var) {
        this.f123038a = 1;
        this.f123039b = f;
        this.f123040c = f2;
        this.f123041d = oj50Var;
    }
}
