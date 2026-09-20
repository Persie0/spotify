package p204p;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class pfs extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final DrawStyle f177135a;

    public pfs(DrawStyle drawStyle) {
        this.f177135a = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            qxy qxyVar = qxy.f193763a;
            DrawStyle drawStyle = this.f177135a;
            if (wj50.m88271j(drawStyle, qxyVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(drawStyle instanceof em51)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            em51 em51Var = (em51) drawStyle;
            textPaint.setStrokeWidth(em51Var.f60824a);
            textPaint.setStrokeMiter(em51Var.f60825b);
            int i = em51Var.f60827d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = em51Var.f60826c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            vk4 vk4Var = em51Var.f60828e;
            textPaint.setPathEffect(vk4Var != null ? vk4Var.f242132a : null);
        }
    }
}
