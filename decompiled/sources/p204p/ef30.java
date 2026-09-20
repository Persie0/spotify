package p204p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class ef30 extends AbstractC2601y5 {

    /* JADX INFO: renamed from: e */
    public static final Pattern[][] f58924e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: b */
    public final Pattern f58926b;

    /* JADX INFO: renamed from: a */
    public final df30 f58925a = new df30();

    /* JADX INFO: renamed from: c */
    public boolean f58927c = false;

    /* JADX INFO: renamed from: d */
    public cl8 f58928d = new cl8(1);

    public ef30(Pattern pattern) {
        this.f58926b = pattern;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: a */
    public final void mo30334a(ku31 ku31Var) {
        cl8 cl8Var = this.f58928d;
        CharSequence charSequence = ku31Var.f126444a;
        StringBuilder sb = (StringBuilder) cl8Var.f39207c;
        if (cl8Var.f39206b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        cl8Var.f39206b++;
        Pattern pattern = this.f58926b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f58927c = true;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: e */
    public final void mo30335e() {
        this.f58925a.f48228g = ((StringBuilder) this.f58928d.f39207c).toString();
        this.f58928d = null;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: f */
    public final gq9 mo30336f() {
        return this.f58925a;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: j */
    public final lwe mo30337j(m1s m1sVar) {
        if (this.f58927c) {
            return null;
        }
        if (m1sVar.f139071i && this.f58926b == null) {
            return null;
        }
        return lwe.m60120a(m1sVar.f139065c);
    }
}
