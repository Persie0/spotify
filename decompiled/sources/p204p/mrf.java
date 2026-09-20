package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class mrf extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f146551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f146552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f146553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrf(String str, String str2, String str3) {
        super(0);
        this.f146551a = str;
        this.f146552b = str2;
        this.f146553c = str3;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.NpvMetadata(this.f146551a, this.f146552b, this.f146553c);
    }
}
