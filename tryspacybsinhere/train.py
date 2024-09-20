import spacy
from spacy.util import minibatch

def load_model():
    nlp = spacy.blank("en")
    return nlp

