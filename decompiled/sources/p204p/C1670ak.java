package p204p;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;
import com.spotify.yourlibrary.uiusecases.elements.accessory.AccessoryView;

/* JADX INFO: renamed from: p.ak */
/* JADX INFO: loaded from: classes11.dex */
public final class C1670ak extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AccessoryView f16380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1670ak(AccessoryView accessoryView, int i) {
        super(0);
        this.f16379a = i;
        this.f16380b = accessoryView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f16379a) {
            case 0:
                return this.f16380b.getResources().getString(R.string.library_row_context_menu_description);
            case 1:
                AccessoryView accessoryView = this.f16380b;
                ColorStateList accessoryColor = accessoryView.getAccessoryColor();
                Drawable drawable = accessoryView.getContext().getDrawable(R.drawable.encore_icon_more_android_24);
                if (drawable == null) {
                    return null;
                }
                drawable.setTintList(accessoryColor);
                return drawable;
            case 2:
                return this.f16380b.getResources().getString(R.string.library_row_dismiss_content_description);
            default:
                AccessoryView accessoryView2 = this.f16380b;
                ColorStateList accessoryColor2 = accessoryView2.getAccessoryColor();
                Drawable drawable2 = accessoryView2.getContext().getDrawable(R.drawable.encore_icon_x_24);
                if (drawable2 == null) {
                    return null;
                }
                drawable2.setTintList(accessoryColor2);
                return drawable2;
        }
    }
}
