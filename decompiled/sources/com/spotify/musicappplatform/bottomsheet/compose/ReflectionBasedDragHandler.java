package com.spotify.musicappplatform.bottomsheet.compose;

import com.spotify.base.java.logging.Logger;
import kotlin.Metadata;
import p204p.bga;
import p204p.fbk;
import p204p.fr70;
import p204p.j1h1;
import p204p.nr60;
import p204p.oq60;
import p204p.oqg1;
import p204p.pqm0;
import p204p.rpv0;
import p204p.spv0;
import p204p.w2a1;
import p204p.wf11;
import p204p.wg61;
import p204p.yuk;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u0003\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR-\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R-\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010$¨\u0006)"}, m24212d2 = {"Lcom/spotify/musicappplatform/bottomsheet/compose/ReflectionBasedDragHandler;", "Lp/wf11;", "sheetState", "<init>", "(Lp/wf11;)V", "", "delta", "dispatchRawDelta", "(F)F", "velocity", "Lp/w2a1;", "settle", "(FLp/fbk;)Ljava/lang/Object;", "getMinAnchor", "()F", "requireOffset", "Lp/wf11;", "Lp/nr60;", "anchoredDraggableStateField", "Lp/nr60;", "getAnchoredDraggableStateField", "()Lp/nr60;", "Lp/oq60;", "cachedSettleFunction$delegate", "Lp/fr70;", "getCachedSettleFunction", "()Lp/oq60;", "cachedSettleFunction", "", "cachedAnchoredDraggableState$delegate", "getCachedAnchoredDraggableState", "()Ljava/lang/Object;", "cachedAnchoredDraggableState", "Lp/pqm0;", "cachedDispatchRawDataField$delegate", "getCachedDispatchRawDataField", "()Lp/pqm0;", "cachedDispatchRawDataField", "cachedMinAnchorFunction$delegate", "getCachedMinAnchorFunction", "cachedMinAnchorFunction", "src_main_java_com_spotify_musicappplatform_bottomsheet-bottomsheet"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ReflectionBasedDragHandler {
    public static final int $stable = 8;
    private final nr60 anchoredDraggableStateField;
    private final wf11 sheetState;

    /* JADX INFO: renamed from: cachedSettleFunction$delegate, reason: from kotlin metadata */
    private final fr70 cachedSettleFunction = new wg61(new rpv0(this, 3));

    /* JADX INFO: renamed from: cachedAnchoredDraggableState$delegate, reason: from kotlin metadata */
    private final fr70 cachedAnchoredDraggableState = new wg61(new rpv0(this, 0));

    /* JADX INFO: renamed from: cachedDispatchRawDataField$delegate, reason: from kotlin metadata */
    private final fr70 cachedDispatchRawDataField = new wg61(new rpv0(this, 1));

    /* JADX INFO: renamed from: cachedMinAnchorFunction$delegate, reason: from kotlin metadata */
    private final fr70 cachedMinAnchorFunction = new wg61(new rpv0(this, 2));

    public ReflectionBasedDragHandler(wf11 wf11Var) {
        this.sheetState = wf11Var;
        this.anchoredDraggableStateField = j1h1.m52155q(wf11Var, "anchoredDraggableState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCachedAnchoredDraggableState() {
        return this.cachedAnchoredDraggableState.getValue();
    }

    private final pqm0 getCachedDispatchRawDataField() {
        return (pqm0) this.cachedDispatchRawDataField.getValue();
    }

    private final pqm0 getCachedMinAnchorFunction() {
        return (pqm0) this.cachedMinAnchorFunction.getValue();
    }

    private final oq60 getCachedSettleFunction() {
        return (oq60) this.cachedSettleFunction.getValue();
    }

    public float dispatchRawDelta(float delta) {
        try {
            pqm0 cachedDispatchRawDataField = getCachedDispatchRawDataField();
            if (cachedDispatchRawDataField == null) {
                return 0.0f;
            }
            Object objMo36585j = ((oq60) cachedDispatchRawDataField.f180351b).mo36585j(cachedDispatchRawDataField.f180350a, Float.valueOf(delta));
            Float f = objMo36585j instanceof Float ? (Float) objMo36585j : null;
            if (f != null) {
                return f.floatValue();
            }
            return 0.0f;
        } catch (Exception e) {
            Logger.m3967c(e, "Error invoking dispatchRawDelta via reflection", new Object[0]);
            return 0.0f;
        }
    }

    public final nr60 getAnchoredDraggableStateField() {
        return this.anchoredDraggableStateField;
    }

    public float getMinAnchor() {
        try {
            pqm0 cachedMinAnchorFunction = getCachedMinAnchorFunction();
            if (cachedMinAnchorFunction == null) {
                return 0.0f;
            }
            return ((Float) ((oq60) cachedMinAnchorFunction.f180351b).mo36585j(cachedMinAnchorFunction.f180350a)).floatValue();
        } catch (Exception e) {
            Logger.m3967c(e, "getMinAnchor", new Object[0]);
            return 0.0f;
        }
    }

    public float requireOffset() {
        return this.sheetState.f250668e.m96964F();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object settle(float f, fbk<? super w2a1> fbkVar) {
        spv0 spv0Var;
        if (fbkVar instanceof spv0) {
            spv0Var = (spv0) fbkVar;
            int i = spv0Var.f212963c;
            if ((i & Integer.MIN_VALUE) != 0) {
                spv0Var.f212963c = i - Integer.MIN_VALUE;
            } else {
                spv0Var = new spv0(this, fbkVar);
            }
        } else {
            spv0Var = new spv0(this, fbkVar);
        }
        Object obj = spv0Var.f212961a;
        int i2 = spv0Var.f212963c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                oq60 cachedSettleFunction = getCachedSettleFunction();
                if (cachedSettleFunction != null) {
                    Object[] objArr = {this.sheetState, new Float(f)};
                    spv0Var.f212963c = 1;
                    Object objM67636e = oqg1.m67636e(cachedSettleFunction, objArr, spv0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM67636e == yukVar) {
                        return yukVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (Exception e) {
            Logger.m3967c(e, "Error invoking settle via reflection", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
