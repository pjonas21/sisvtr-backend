package dev.pjonas.sisvtr.services;

import dev.pjonas.sisvtr.models.Viatura;

import java.util.List;
import java.util.UUID;

public interface ViaturaService {
    public Viatura criaNovo(Viatura novo);
    public Viatura recuperaViatura(UUID id);
    public Viatura editaViatura(Viatura viatura);
    public List<Viatura> listarViaturas();
}
