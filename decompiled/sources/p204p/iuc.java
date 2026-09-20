package p204p;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class iuc implements CharacterIterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f105932a;

    /* JADX INFO: renamed from: b */
    public final int f105933b;

    /* JADX INFO: renamed from: c */
    public int f105934c = 0;

    public iuc(int i, CharSequence charSequence) {
        this.f105932a = charSequence;
        this.f105933b = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f105934c;
        if (i == this.f105933b) {
            return (char) 65535;
        }
        return this.f105932a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f105934c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f105933b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f105934c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f105933b;
        if (i == 0) {
            this.f105934c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f105934c = i2;
        return this.f105932a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f105934c + 1;
        this.f105934c = i;
        int i2 = this.f105933b;
        if (i < i2) {
            return this.f105932a.charAt(i);
        }
        this.f105934c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f105934c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f105934c = i2;
        return this.f105932a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f105933b || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f105934c = i;
        return current();
    }
}
