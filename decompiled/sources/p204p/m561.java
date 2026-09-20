package p204p;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class m561 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f140153a;

    /* JADX INFO: renamed from: b */
    public final g50 f140154b;

    public m561(Context context, g50 g50Var) {
        this.f140153a = context;
        this.f140154b = g50Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f140154b.mo43565b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f140154b.mo43566c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new mie0(this.f140153a, this.f140154b.mo43568e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f140154b.mo43569f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f140154b.mo43570g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f140154b.f76559c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f140154b.mo43571h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f140154b.f76558b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f140154b.mo43572i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f140154b.mo43573j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f140154b.mo43575l(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f140154b.mo43577o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f140154b.f76559c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f140154b.mo43579q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f140154b.mo43580s(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f140154b.mo43576n(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f140154b.mo43578p(i);
    }
}
